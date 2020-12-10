package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		M�todos Abstratos
		 * 
		 * 	- S�o m�todos que n�o possuem implementa��o.
		 * 	- M�todos precisam ser abstratos quando a classe � gen�rica demais
		 * 	  para conter sua implementa��o.
		 * 	- Se uma classe possuir pelo menos um m�todo abstrato, ent�o esta
		 * 	  classe tamb�m � abstrata.
		 * 
		 * 	OBS: Nota��o UML: nome do m�todo em it�lico.
		 * 
		 * 		Exerc�cio resolvido
		 * 
		 * 	Fazer uma programa para ler os dados de N figuras (N fornecido pelo
		 * 	usu�rio), e depois mostrar as �reas destas figuras na mesma ordem em
		 * 	que foram digitadas.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char option = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next()); // A palavra digitada aqui vai ser convertida para o meu objeto do tipo enumerado Color
			
			if (option == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapes.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();

	}

}
