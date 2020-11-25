package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um npumero inteiro N e uma matriz de ordem N
		 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a
		 * quantidade de valores negativos da matriz.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matriz = new int[n][n]; // Instancia uma matriz com n linhas e n colunas
		
		// Fazendo 2 fors. Um para percorrer as linhas e outro para percorrer as colunas
		for (int i = 0; i < n; i++) { // ou i < matriz.length
			for (int j = 0; j < n; j++) { // ou j < matriz[i].length
				matriz[i][j] = sc.nextInt();
			}
		}
		
		// Fazendo um for para imprimir a diagonal principal
		System.out.print("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		// Obtendo os números negativos da matriz
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.print("Negative numbers: " + count);
		
		sc.close();

	}

}
