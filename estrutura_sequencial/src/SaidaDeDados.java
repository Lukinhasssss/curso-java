import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		System.out.print("Hello World"); // Não tem quebra de linha no final
		System.out.println("Bom dia");
		
		Locale.setDefault(Locale.US); // Para definir o . como separador decimal
		int x = 32;
		double y = 10.35784;
		double z = 15.234;
		double resultado = y + z;
		
		System.out.println(x);
		System.out.printf("%.2f%n", y); // %.2f define o número com 2 casas decimais e o %n é a quebra de linha
		
		// Concatenando elementos
		System.out.printf("%f + %f = %.2f METROS%n%n", y, z, resultado);
		
		
		String nome = "Lucas";
		int idade = 23;
		double renda = 3200.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
	}

}
