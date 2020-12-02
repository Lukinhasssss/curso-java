package entities;

public class BusinessAccount extends Account { // Desta forma e defino que a classe BusinessAccount irá herdar todos os dados e comportamentos da classe Account
	
	private Double loanLimit; // Limite de empréstimo
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // Serve para executar a lógica do construtor da classe base
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) { // Operação para realizar um empréstimo
		if (amount <= loanLimit) {  // Se o valor que eu quero pedir emprestado for menor ou igual ao meu limite de empréstimo...
			balance += (amount - 10.0);
		}
	}
	
	
	/*
	 * 	Definições importantes:
	 * 
	 * 		- Herança é uma relação "é-um"
	 * 		- Herança é uma associação entre classes (e não entre objetos)
	 */

}
