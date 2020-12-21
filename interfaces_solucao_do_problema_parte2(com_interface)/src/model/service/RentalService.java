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
		double hours = (double)(t2 - t1) / 1000 / 60 / 60; // Acha a difen�a em milissegundos, / 1000 converte para segundos, / 60 converte para minutos e /60 converte para hora
		
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
	 * 	Invers�o de controle:
	 * 		Padr�o de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas depend�ncias.
	 * 
	 * 	Inje��o de depend�ncia:
	 * 		� uma forma de realizar a invers�o de controle: um componente externo instancia a depend�ncia, que � ent�o
	 * 		injetada no objeto "pai". Pode ser implementada de v�rias formas:
	 * 		  - Construtor
	 * 		  - Classe de instancia��o (builder / factory)
	 * 		  - Container / framework
	 */

}