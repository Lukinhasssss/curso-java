package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		/*
		 * Date
		 * 	Um objeto Date internamente armazena:
		 * 	- O número de milissegundosdesde a meia noite do dia 01/01/1970 GMT (UTC)
		 * 		- GMT: Greenwich Mean Time (time zone)
		 * 		- UTC: Coordinated Universal Time (time standard)
		 * 
		 * SimpleDateFormat
		 * 	- Define formatos para conversão entre Date e String
		 * 		- dd/MM/yyyy -> 24/11/2020
		 * 		- dd/MM/yyyy HH:mm:ss -> 24/11/2020 09:20:15
		 * 
		 * Padrão ISO 8601 e classe Instant
		 * 	- Formato: yyyy-MM-ddTHH:mm:ssZ
		 * 	- Exemplo: "2018-06-25T15:42:07Z"
		 * 	- Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		 */
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); // Instancia uma data com o instante atual
		Date x2 = new Date(System.currentTimeMillis()); // Pega o instante atual do sistema, converte para milisegundos e cria a data com esse valor
		Date x3 = new Date(0L); // O L indica que é um tipo long
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("24/11/2020");
		Date y2 = sdf2.parse("24/11/2020 09:00:00");
		Date y3 = Date.from(Instant.parse("2020-11-24T09:00:00Z"));
		
		System.out.println("Imprimindo a data sem formatação");
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
				
		System.out.println();
		System.out.println("Imprimindo a data com formatação");
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		
		System.out.println();
		System.out.println("Imprimindo a data e hora atual");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		
		System.out.println();
		System.out.println("Instanciando uma data no padrão ISO 8601");
		System.out.println("y3: " + sdf3.format(y3));
		
		System.out.println("---------------------------------------------------");
		
		/*
		 * Manipulando datas com Calendar
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = Date.from(Instant.parse("2020-11-24T09:00:00Z"));
		
		System.out.println(sdf.format(date));
		
		// Acrescentando 4h no date
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date); // Agora eu tenho um Calendar com minha data já instanciada dentro dele
		calendar.add(Calendar.HOUR_OF_DAY, 4); // Adiciona 4h ao calendar
		date = calendar.getTime();
		
		System.out.println(sdf.format(date));
		
		// Obtendo uma unidade de tempo, por exemplo, os minutos
		int minutes = calendar.get(Calendar.MINUTE); // Retorna a quantidade de minutos
		int month = 1 + calendar.get(Calendar.MONTH); // OBSERVAÇÃO --> MONTH começa do zero(0)
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
