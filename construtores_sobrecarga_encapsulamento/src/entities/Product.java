package entities;

public class Product {
	
	private String name; // private significa que os atributos n�o poder�o ser acessados por outras classes
	private double price;
	private int quantity;
	
	/*
	 * Gerando construtores e getters and setters automaticamente
	 * 		- bot�o direito -> source -> generate constructor using fields
	 * 		- bot�o direito -> source -> generate getters ans setters
	 */
	
	// Declarando um construtor! Obs: O construtor geralmente � adicionado depois dos atributos.
	public Product() {} // Construtor vazio!!!
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { // Sobrecarga!!!
		this.name = name;
		this.price = price;
	}
	
	
	// Os m�todos get e set s�o colocados depois dos construtores
	public String getName() { //get --> m�todo respons�vel por obter o atributo
		return name;
	}
	
	public void setName(String name) { //set --> m�todo respons�vel por alterar o valor do atributo
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());
	}

}