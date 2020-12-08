package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		/*
		 * 	Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).
		 * 	Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que
		 * 	foram digitados.
		 * 
		 * 	Todo produto possui nome e preço. Produtos importados possuem uma taxa de
		 * 	alfândega, e produtos usados possuem data de fabricação. Estes dados específicos
		 * 	devem ser acrescentados na etiqueta de preço. Para produtos importados, a taxa
		 * e alfândega deve ser acrescentada ao final do produto.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch (option) {
				case 'c':
					products.add(new Product(name, price));
					break;
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date manufactureDate = sdf.parse(sc.next());
					products.add(new UsedProduct(name, price, manufactureDate));
					break;
				case 'i':
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					products.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();

	}

}