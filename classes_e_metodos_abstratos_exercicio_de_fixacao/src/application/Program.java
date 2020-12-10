package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 	Fazer um programa para ler os dados de N contribuintes (N fornecido pelo
		 * 	usu�rio), os quais podem ser pessoa f�sica ou pessoa jur�dica, e depois
		 * 	mostrar o valor do imposto pago por cada um, bem como o total de imposto
		 * 	arrecadado.
		 * 
		 * 	Os dados de pessoa f�sica s�o: nome, renda anual e gastos com sa�de. Os
		 * 	dados de pessoa jur�dica s�o: nome, renda anual e n�mero de funcion�rios.
		 * 	As regras para c�lculo de imposto s�o as seguintes:
		 * 
		 * 	PESSOA F�SICA: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de
		 * 	imposto. Pessoas com renda de 20000.00 pagam 25% de imposto. Se a pessoa
		 * 	teve gastos com sa�de, 50% destes gastos s�o abatidos no imposto.
		 * 	EXEMPLO: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com
		 * 	sa�de, o imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00
		 * 
		 * 	PESSOA JUR�DICA: pessoas jur�dicas pagam 16% de imposto. Por�m, se a
		 * 	empresa possuir mais de 10 funcion�rios, ela paga 14% de imposto.
		 * 	EXEMPLO: uma empresa cuja renda foi 400000.00 e possui 25 funcion�rios,
		 * 	o imposto fica: 400000 * 14% = 56000.00
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (option == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer taxPayer : taxPayers) {
			System.out.println(taxPayer.getName() + ": " + String.format("%.2f", taxPayer.tax()));
		}
		
		double totalTaxesPaid = 0.0;
		for (TaxPayer taxPayer : taxPayers) {
			totalTaxesPaid += taxPayer.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxesPaid);
		
		sc.close();

	}

}
