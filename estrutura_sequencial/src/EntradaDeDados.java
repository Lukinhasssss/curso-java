import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in); // Sempre que utilizar o Scanner é necessário utilizar o sc.close() quando terminar de utilizá-lo
		
		String nome;
		int idade;
		double salario;
		char sexo;
		
		System.out.println("Digite seu nome:");
		nome = sc.nextLine(); // Também é possível utilizar o sc.next() que imprime somente uma palavra. Obs: utilizar quebra de linha após o sc.next()
		
		System.out.println("Digite sua idade:");
		idade = sc.nextInt();
		
		System.out.println("Digite seu salário:");
		salario = sc.nextDouble();
		
		System.out.println("Digite seu sexo: (M, F)");
		sexo = sc.next().charAt(0); // charAt(0) pega o primeiro caracter da String

		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade é: " + idade);
		System.out.printf("Seu salário é: %.2f%n", salario);
		System.out.println("Seu sexo é: " + sexo);
		
		sc.close();
	}

}
