package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário,
		 * 	deseja-se registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizados
		 * 	possuem ainda uma despesa adicional.
		 * 
		 * 		O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas
		 * 	trabalhadas, sendo que os funcionários terceirizados ainda recebem um bôus correspondente
		 * 	a 110% de sua despesa adicional.
		 * 
		 * 		Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário)
		 * 	e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento
		 * 	de cada funcionário na mesma ordem em que foram digitados.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				// Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				// employees.add(employee);
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				// Employee employee = new Employee(name, hours, valuePerHour);
				// employees.add(employee);
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employee : employees) { // Para cada funcionário(employee) da lista de funcionários(employees)...
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}
		
		sc.close();

	}

}
