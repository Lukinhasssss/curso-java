package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 	Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens
		 * 	vendidos. Cada item possui um nome, preço unitário e quantidade, separados por
		 * 	vírgula. Você deve gerar um novo arquivo chamado "summary.csv", localizado em
		 * 	uma subpasta chamada "out" a partir da pasta original do arquivo de origem,
		 * 	contendo apenas o nome e o valor total para aquele item (preço unitário multiplicado
		 * 	pela quantidade), conforme exemplo.
		 * 
		 * 		Example:
		 * 
		 * 	Source file:										Output file (out/summary.csv):
		 * 	
		 * 	TV LED, 1290.99, 1									TV LED, 1290.99
		 * 	Video Game Chair, 350.50, 3							Video GameChair, 1051.50
		 * 	Iphone X, 900.00, 2									Iphone X, 1800.00
		 * 	Samsung Galaxy 9, 850.00, 2							Samsung Galaxy 9, 1700.00
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		@SuppressWarnings("unused")
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String itemCsv = br.readLine();
			
			while (itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				products.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Product product : products) {
					bw.write(product.getName() + "," + String.format("%.2f", product.total()));
					bw.newLine();
				}
				System.out.println(targetFileStr + "CREATED!");
			}
			catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
		}
		catch(IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		sc.close();

	}

}
