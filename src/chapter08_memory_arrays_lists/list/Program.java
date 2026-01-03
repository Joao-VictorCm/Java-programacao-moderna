package chapter08_memory_arrays_lists.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		//add elementos a lista
		list.add("fulana");
		list.add("Ciclano");
		list.add("Meusasno");
		list.add("Ceutonino");
		
		//add elementos em uma posição desejada
		list.add(1, "marco");
		
		//ver o tamanho da lista
		System.out.println(list.size());
		
		/*remover elemento
		  para remover por posição "list.remove(1)"
		
		list.remove("Ciclano") */
		
		//para encontrar a posição do elemento
		System.out.println("----------------------------------------");
		System.out.println("index ciclano: "+list.indexOf("Ciclano"));
		System.out.println("index que não existe: "+list.indexOf("ex01"));
		System.out.println("----------------------------------------");
		
		//filtrar lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------------");
		//encontrar o primeiro elemento que atenda o meu predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'k').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("----------------------------------------");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------------");
		
		//remover com predicado
		list.removeIf(x -> x.charAt(0) == 'f');
		
		for(String x : list) {
			System.out.println(x);
		}

	}

}
