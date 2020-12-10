package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Estrutura try-catch
		 * 
		 * 	Bloco try
		 * 		- Contém o código que representa a execução normal do trecho de código
		 * 		  que pode acarretar em uma exceção.
		 * 
		 * 	Bloco catch
		 * 		- Contém o código a ser executado caso uma exceção ocorra.
		 * 		- Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido).
		 * 
		 * 	Bloco finally
		 * 		- É um bloco que contém código a ser executado independentemente de ter
		 * 		  ocorrido ou não uma exceção.
		 * 		- Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro
		 * 		  recurso específico ao final do processamento.
		 */
		
		method1();
		
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
		
	}
	
	public static void method2() {
		
		System.out.println("***METHOD2 START***");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" "); // Para ler vários dados em uma mesma linha separados por um espaço em branco.
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); // Mostra todas as chamadas de métodos até acarretar na exceção. | Mostra as mensagens de erro no console.
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		
		System.out.println("***METHOD2 END***");
		
	}

}
