package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		/*
		 * 		ENUMERAÇÕES
		 *	
		 *	- É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas.
		 *	- Palavra chave em Java: enum
		 *	- Vantagem: Melhor semântica, código mais legível e auxiliado pelo compilador.
		 */
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		System.out.println();
		
		// Conversão de String para enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
