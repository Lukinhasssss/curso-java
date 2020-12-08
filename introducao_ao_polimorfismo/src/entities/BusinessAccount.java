package entities;

public class BusinessAccount extends Account { // Desta forma e defino que a classe BusinessAccount ir� herdar todos os dados e comportamentos da classe Account
	
	private Double loanLimit; // Limite de empr�stimo
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // Serve para executar a l�gica do construtor da classe base
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) { // Opera��o para realizar um empr�stimo
		if (amount <= loanLimit) {  // Se o valor que eu quero pedir emprestado for menor ou igual ao meu limite de empr�stimo...
			balance += (amount - 10.0);
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	
	/*
	 * 	Defini��es importantes:
	 * 
	 * 		- Heran�a � uma rela��o "�-um"
	 * 		- Heran�a � uma associa��o entre classes (e n�o entre objetos)
	 */

}
