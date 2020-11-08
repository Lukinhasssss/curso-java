import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dia;
		String diaDaSemana;
		
		System.out.println("Digite um dia da semana se 1 a 7:");
		dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			diaDaSemana = "Domingo";
			break;
		case 2:
			diaDaSemana = "Segunda";
			break;
		case 3:
			diaDaSemana = "Terça";
			break;
		case 4:
			diaDaSemana = "Quarta";
			break;
		case 5:
			diaDaSemana = "Quinta";
			break;
		case 6:
			diaDaSemana = "Sexta";
			break;
		case 7:
			diaDaSemana = "Sábado";
			break;
		default:
			diaDaSemana = "Valor inválido";
		}
		
		System.out.println(diaDaSemana);
		
		sc.close();

	}

}
