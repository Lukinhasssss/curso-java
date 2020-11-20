package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// Declarando uma lista
		List<String> list = new ArrayList<String>(); // Instanciando uma lista de Strings cujo nome é list e que recebe um ArrayList
		// List<String> list = new ArrayList<>(); Também é possível instanciar a lista sem o String pois ele é opcional
		
		// Adicionando elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");  // Inserindo o elemento entre o Alex e o Bob
		
		// Tamanho da lista
		System.out.println(list.size());
		
		// Removendo um elemento da lista
		list.remove("Anna");
		list.remove(1);
		
		// Removendo itens que atendam a um predicado, por exemplo, remover todo mundo que começa com a letra M.
		list.removeIf(x -> x.charAt(0) == 'M'); // Remover toda String x tal que x.charAt(0) == 'M'
		
		// Encontrando o index de um determinado elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // Obs: Quando o indexOf não encontra um elemento ele retorna -1
		
		for (String x : list) { // Para cada String x pertencente à list...
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		list.remove("Bob");
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		// Filtrando somente os nomes que começam com a letra 'A' e devolvendo para a variavel result
		List<String> results = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String result : results) {
			System.out.println(result);
		}
		
		System.out.println("------------------------------");
		
		// Encontrando um elemento da lista que atenda a um predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Pega o primeiro elemento que começa com a letra 'A'
		System.out.println(name);
		

	}

}


//Tamanho da lista: size()
//Inserir elementos na lista: add(obj), add(int, obj)
//remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
//Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
//Filtrar lista com base em predicado: List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
//Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);