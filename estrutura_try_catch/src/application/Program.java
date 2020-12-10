package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Estrutura try-catch
		 * 
		 * 	Bloco try
		 * 		- Cont�m o c�digo que representa a execu��o normal do trecho de c�digo
		 * 		  que pode acarretar em uma exce��o.
		 * 
		 * 	Bloco catch
		 * 		- Cont�m o c�digo a ser executado caso uma exce��o ocorra.
		 * 		- Deve ser especificado o tipo da exce��o a ser tratada (upcasting � permitido).
		 * 
		 * 	Bloco finally
		 * 		- � um bloco que cont�m c�digo a ser executado independentemente de ter
		 * 		  ocorrido ou n�o uma exce��o.
		 * 		- Exemplo cl�ssico: fechar um arquivo, conex�o de banco de dados, ou outro
		 * 		  recurso espec�fico ao final do processamento.
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
			String[] vect = sc.nextLine().split(" "); // Para ler v�rios dados em uma mesma linha separados por um espa�o em branco.
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); // Mostra todas as chamadas de m�todos at� acarretar na exce��o. | Mostra as mensagens de erro no console.
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		
		System.out.println("***METHOD2 END***");
		
	}

}
