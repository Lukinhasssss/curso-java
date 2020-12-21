package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;
	
	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime(); // Pega o valor em milissegundos da data
		long t2 = carRental.getFinish().getTime();
		double hours = (double)(t2 - t1) / 1000 / 60 / 60; // Acha a difença em milissegundos, / 1000 converte para segundos, / 60 converte para minutos e /60 converte para hora
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour; // Math.ceil arredonda o valor para cima
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay; // (hours / 24) para achar a quantidade em dias
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
	/*
	 * 		CONCEITOS IMPORTANTES:
	 * 
	 * 	Inversão de controle:
	 * 		Padrão de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependências.
	 * 
	 * 	Injeção de dependência:
	 * 		É uma forma de realizar a inversão de controle: um componente externo instancia a dependência, que é então
	 * 		injetada no objeto "pai". Pode ser implementada de várias formas:
	 * 		  - Construtor
	 * 		  - Classe de instanciação (builder / factory)
	 * 		  - Container / framework
	 */

}