package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Polimorfismo
		 * 
		 * 	- Em Programa��o Orientada a Objetos, polimorfismo � um recurso que
		 * 	permite que vari�veis de um mesmo tipo mais gen�rico possam apontar
		 * 	para objetos de tipos espec�ficos diferentes, tendo assim comportamentos
		 * 	diferentes conforme cada tipo espec�fico.
		 */
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}