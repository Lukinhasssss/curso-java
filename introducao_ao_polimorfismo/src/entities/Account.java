package entities;

public class Account {
	
	private Integer number;
	private String holder; // holder -> Títular da conta
	protected Double balance; // protected --> Permite o acesso por outra classe do mesmmo pacote e também por uma subclasse(independente do pacote) 
	
	public Account() {} // Construtor vazio
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	/*
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	OBS: Como o saldo não pode ser alterado essa operação setBalance não pode ser realizada
	*/
	
	public void withdraw(double amount) { // Método para realizar a operação de saque (withdraw)
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) { // Método para realizar um depósito
		balance += amount;
	}

}
