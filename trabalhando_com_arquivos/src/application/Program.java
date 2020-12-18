package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 		Lendo arquivo texto com classes File e Scanner
		 * 
		 * 	File - Representa��o abstrata de um arquivo e seu caminho
		 * 	Scanner - Leitor de texto
		 */
		
//		File file = new File("c:\\temp\\in.txt");
//		Scanner sc = null;
//		
//		try {
//			sc = new Scanner(file);
//			while (sc.hasNextLine()) { // Enquanto ainda tiver uma nova linha no arquivo...
//				System.out.println(sc.nextLine());
//			}
//		}
//		catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		finally { // � uma boa pr�tica colocar o fechamento dos recursos no bloco finally
//			if (sc != null) {
//				sc.close();
//			}
//		}
		
		/*
		 * 		FileReader e BufferedReader
		 * 
		 * 	FileReader (stream de leitura de caracteres a partir de arquivos)
		 * 	BufferedReader (mais r�pido)
		 */
		
//		String path = "c:\\temp\\in.txt";
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr); // O BufferedReader � instanciado a partir do FileReader
//			
//			String line = br.readLine(); // Para ler 1 linha do arquivo
//			
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		}
//		catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		finally {
//			try {
//				if (br != null) {
//					br.close();
//				}
//				if (fr != null) {
//					fr.close();
//				}
//			}
//			catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		/*
		 * 		Bloco try-with-resources
		 * 
		 * 	� um bloco try que declara um ou mais recursos, e garante que esses recursos ser�o fechados
		 * 	ao final do bloco.
		 */
		
//		String path = "c:\\temp\\in.txt";
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			
//			String line = br.readLine(); // Para ler 1 linha do arquivo
//			
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		}
//		catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
		
		/*
		 * 		FileWriter e BufferedWriter
		 * 
		 * 	FileWriter (stream de escrita de caracteres em de arquivos)
		 * 	  - Cria/recria o arquivo: new FileWriter(path)
		 * 	  - Acrescenta ao arquivo existente: new FileWriter(path, true)
		 * 
		 * 	BufferedWriter (mais r�pido)
		 */
		
//		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
//		
//		String path = "C:\\temp\\out.txt";
//		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
//			for (String line : lines) {
//				bw.write(line);
//				bw.newLine();
//			}
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		/*
		 * 		Manipulando pastas com File
		 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a folder path: ");
//		String strPath = sc.nextLine();
//		
//		File path = new File(strPath);
//		
//		File[] folders = path.listFiles(File::isDirectory);
//		System.out.println("FOLDERS:");
//		for (File folder : folders) {
//			System.out.println(folder);
//		}
//		
//		File[] files = path.listFiles(File::isFile);
//		System.out.println("FILES:");
//		for (File file : files) {
//			System.out.println(file);
//		}
//		
//		boolean success = new File(strPath + "\\subdir").mkdir();
//		System.out.println("Directory created successfully: " + success);
//		
//		sc.close();
		
		/*
		 * 		Informa��es do caminho do arquivo
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		
		sc.close();
		
	}

}
