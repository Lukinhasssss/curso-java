package entities;

public class Account {
	
	private Integer number;
	private String holder; // holder -> T�tular da conta
	protected Double balance; // protected --> Permite o acesso por outra classe do mesmmo pacote e tamb�m por uma subclasse(independente do pacote) 
	
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
	OBS: Como o saldo n�o pode ser alterado essa opera��o setBalance n�o pode ser realizada
	*/
	
	public void withdraw(double amount) { // M�todo para realizar a opera��o de saque (withdraw)
		balance -= amount;
	}
	
	public void deposit(double amount) { // M�todo para realizar um dep�sito
		balance += amount;
	}

}
