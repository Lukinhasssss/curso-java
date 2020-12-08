package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 	Herança: é um tipo de associação que permite que uma classe herde
		 * 	todos os dados e comportamentos (atributos e métodos) de outra.
		 * 
		 * 		Exemplo:
		 * 	Suponha um negócio de banco que possui uma conta comum e uma conta
		 * 	para empresas, sendo que a conta para empresa possui todos os
		 * 	membros da conta comum, mais um limite de empréstimo e uma operação
		 * 	de realizar empréstimo.
		 */
		
		/*
		 * 		Sobreposição ou Sobrescrita
		 * 
		 * 	- É a implementação de um método de uma superclasse na subclasse
		 * 	- É fortemente recomendável usar a anotação @Override em um método sobrescrito
		 * 	- Facilita a leitura e compreensão do código
		 * 	- Avisamos ao compilador (boa prática)
		 * 
		 * 		Exemplo:
		 * 	Suponha que a operação de saque possui uma taxa no valor de 5.0. Entretanto,
		 * 	se a conta for do tipo pouança, esta taxa não deve ser cobrada.
		 * 	Como resolver isso ???
		 * 	Resposta: sobrescrevendo o método withdraw na subclasse SavingsAccount
		 */
		
		/*
		 * 		Palavra super
		 * 
		 * 	- É possível chamar a implementação da superclasse usando a palavra super.
		 * 
		 * 		Exemplo:
		 * 	Suponha que, na classe BusinessAccount, a regra para saque seja realizar
		 * 	o saque normalmente da superclasse e descontar mais 2.0.
		 */
		
		/*
		 * @SuppressWarnings("unused") Account account = new Account(1001, "Alex", 0.0);
		 * BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0,
		 * 500.0);
		 * 
		 * // UPCASTING
		 * 
		 * @SuppressWarnings("unused") Account account1 = businessAccount; Account
		 * account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0); Account account3 =
		 * new SavingsAccount(1004, "Anna", 0.0, 0.01);
		 * 
		 * // DOWNCASTING BusinessAccount account4 = (BusinessAccount)account2;
		 * account4.loan(100.0);
		 * 
		 * // BusinessAccount account5 = (BusinessAccount)account3; // Neste caso dará
		 * erro de execução if (account3 instanceof BusinessAccount) { BusinessAccount
		 * account5 = (BusinessAccount)account3; account5.loan(200.0);
		 * System.out.println("Loan!"); // Loan == empréstimo }
		 * 
		 * if (account3 instanceof SavingsAccount) { SavingsAccount account5 =
		 * (SavingsAccount)account3; account5.updateBalance();
		 * System.out.println("Update!"); }
		 */
		
		// SOBREPOSIÇÃO
		Account account1 = new Account(1001, "Alex", 1000.0);
		account1.withdraw(200.0);
		System.out.println(account1.getBalance());
		
		Account account2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		account2.withdraw(200.0);
		System.out.println(account2.getBalance());
		
		Account account3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		account3.withdraw(200.0);
		System.out.println(account3.getBalance());

	}

}