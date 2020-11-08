import java.util.Locale;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		System.out.println("Digite as horas:");
		horas = sc.nextInt();
		
		if (horas <= 12) {
			System.out.println("Bom dia");
		} else if (horas <= 18) {
			System.out.println("Boa tarde");
		} else if (horas <= 23) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Hora inválida!");
		}
		
		sc.close();
	}

}
