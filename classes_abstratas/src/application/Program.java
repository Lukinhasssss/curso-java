package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Classes Abstratas
		 * 
		 * 	- São classes que não podem ser instânciadas
		 * 	- É uma forma de garantir herança total: somente subclasses não abstratas
		 * 	  podem ser instanciadas, mas nunca a superclasse abstrata
		 * 
		 * 		Exemplo:
		 * 
		 * 	Suponha que em um negócio relacionado a banco, apenas contas poupanças e
		 * 	contas para empresas são permitidas. Não existe conta comum.
		 * 
		 * 	Para garantir que contas comuns não possam ser instanciadas, basta
		 * 	acrescentarmos a palavra "abstract" na declaração da classe.
		 * 
		 * OBS: Notação UML: nome da classe em itálico
		 */
		
		
		
		/*
		 * 		Questionamento
		 * 
		 * 	Se a classe Account não pode ser instanciada, por que simplesmente não criar
		 * 	somente SavingsAccount e BusinessAccount?
		 * 
		 * 	Resposta:
		 * 		- Reuso
		 * 		- Polimorfismo: a superclasse genérica nos permite tratar de forma fácil
		 * 		  e uniforme todos os tipos de conta, inclusive com polimorfismo se for
		 * 		  o caso. Por exemplo, você pode colocar todos os tipos de contas em uma
		 * 		  mesma coleção.
		 * 
		 * 	Demonstração: suponha que você queira:
		 * 		- Totalizar o saldo de todas as contas.
		 * 		- Depositar 10.00 em todas as contas.
		 */
		
		Locale.setDefault(Locale.US);
		List<Account> accounts = new ArrayList<>();
		
		accounts.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		accounts.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		accounts.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		accounts.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		// Totalizando o saldo de todas as contas
		double sum = 0.0;
		for (Account account : accounts) {
			sum += account.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		// Depositando 10.00 em todas as contas
		for (Account account : accounts) {
			account.deposit(10.0);
		}
		
		for (Account account : accounts) {
			System.out.printf("Updated balance for account %d: %.2f%n", account.getNumber(), account.getBalance());
		}

	}

}
