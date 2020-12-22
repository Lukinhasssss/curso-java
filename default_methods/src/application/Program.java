package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Default methods (defender methods)
		 * 
		 * 	� A partir do Java 8, interfaces podem conter m�todos concretos.
		 * 
		 * 	� A inten��o b�sica � prover implementa��o padr�o para m�todos, de modo a evitar:
		 * 	    � 1) repeti��o de implementa��o em toda classe que implemente a interface.
		 * 		� 2) a necessidade de se criar classes abstratas para prover reuso da implementa��o.
		 * 
		 * 	� Outras vantagens:
		 * 		� Manter aretrocompatibilidade com sistemas existentes.
		 * 		� Permitir que "interfaces funcionais" (que devem conter apenas um m�todo) possam prover
		 * 		  outras opera��es padr�o reutiliz�veis.
		 */
		
		/*
		 * 		Problema exemplo
		 * 
		 * 	Fazer um programa para ler uma quantia e a dura��o em meses
		 * 	de um empr�stimo. Informar o valor a ser pago depois de decorrido o prazo do
		 * 	empr�stimo, conforme regras de juros do Brasil. A regra de c�lculo de juros
		 * 	do Brasil � juro composto padr�o de 2% ao m�s.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService interestService = new BrazilInterestService(2.0);
		double payment = interestService.payment(amount, months);
		
		System.out.println("Payment after " + months + " months");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();

	}

}
