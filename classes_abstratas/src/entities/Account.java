package entities;

public abstract class Account {
	
	private Integer number;
	private String holder;
	protected Double balance; 
	
	public Account() {}
	
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
	OBS: Como o saldo n�o pode ser alterado essa opera��o setBalance n�o pode ser realizada
	*/
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

}
