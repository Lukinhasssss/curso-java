import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, resultado;
		
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				resultado = x * y;
				System.out.printf("%d x %d = %d%n", x, y, resultado);
			}
		}
		
		sc.close();
	}

}
