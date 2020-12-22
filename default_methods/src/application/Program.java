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
		 * 	• A partir do Java 8, interfaces podem conter métodos concretos.
		 * 
		 * 	• A intenção básica é prover implementação padrão para métodos, de modo a evitar:
		 * 	    • 1) repetição de implementação em toda classe que implemente a interface.
		 * 		• 2) a necessidade de se criar classes abstratas para prover reuso da implementação.
		 * 
		 * 	• Outras vantagens:
		 * 		• Manter aretrocompatibilidade com sistemas existentes.
		 * 		• Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover
		 * 		  outras operações padrão reutilizáveis.
		 */
		
		/*
		 * 		Problema exemplo
		 * 
		 * 	Fazer um programa para ler uma quantia e a duração em meses
		 * 	de um empréstimo. Informar o valor a ser pago depois de decorrido o prazo do
		 * 	empréstimo, conforme regras de juros do Brasil. A regra de cálculo de juros
		 * 	do Brasil é juro composto padrão de 2% ao mês.
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
