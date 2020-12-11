package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 	Fazer um programa para ler os dados de uma conta banc�ria e depois realizar um
		 * 	saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode ocorrer
		 * 	ou se n�o houver saldo na conta, ou se o valor do saque for superior ao limite
		 * 	de saque da conta.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch(DomainException e) {
			System.out.println("Withdraw erro: " + e.getMessage());
		}
		
		sc.close();

	}

}
