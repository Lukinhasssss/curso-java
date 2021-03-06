package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e
		 * salario) de N funcion�rios. N�o deve haver repeti��o de id.
		 * 
		 * Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado
		 * funcion�rio. Para isso, o programa deve ler um id e o valor X. Se o id
		 * informado n�o existir, mostrar uma mensagem e abortar a opera��o. Ao final,
		 * mostrar a listagem atualizada dos funcion�rios, conforme exemplos.
		 * 
		 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o
		 * sal�rio possa ser mudado livremente. Um sal�rio s� pode ser aumentado com
		 * base em uma opera��o de aumento por porcentagem dada.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>(); // Para criar uma lista de funcionarios(Employee)
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			// Instanciando um funcion�rio
			Employee employee = new Employee(id, name, salary);
			
			// Inserindo o funcion�rio na lista
			list.add(employee);
			
			/*
			 * Outra forma de fazer:
			 * list.add(new Employee(id, name, salary));
			 */
		}
		
		// Atualizando sal�rio de um funcion�rio
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();
		
		Employee employee = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.println("This id does not exist!");
			System.out.println();
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
			System.out.println();
		}
		
		// Listando funcion�rios
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}
	
	/* public Integer hasId(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null; 
	} */
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
