package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"}; // Instancia um vetor com 3 posições
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------");
		
		for (String obj : vect) { // Percorre todos os elementos do vetor vect chamando cada um dos elementos de obj
			System.out.println(obj);
		}

	}

}