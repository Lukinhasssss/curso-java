package entities;

public final class SavingsAccount extends Account { // Savings Account == Conta Poupan�a | // final evita que a classe seja herdada
	
	private Double interestRate; // taxa de juros
	
	public SavingsAccount() {
		super();
	} // Construtor padr�o
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	} // Construtor com argumentos
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() { // M�todo respons�vel por atualizar o saldo da conta com base na taxa de juros
		balance += balance * interestRate;
	}
	
	@Override // SOBRECARGA DO M�TODO withdraw()
	public final void withdraw(double amount) { // final evita que o m�todo seja sobreposto por uma subclasse desta classe
		balance -= amount;
	}

}
