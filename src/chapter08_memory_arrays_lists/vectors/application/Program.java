package chapter08_memory_arrays_lists.vectors.application;

import java.util.Scanner;

import chapter08_memory_arrays_lists.vectors.dados.Dados;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e os dados (nome, preço) de N Produtos.
		 * Aramzene os N produtos em um vetor.
		 * Em seguida, mostrar o preço médio dos produtos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Dados[] vect = new Dados[n];
		
		
		//declarações
		for(int i =0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Dados(name, price);
			
		}
		
		
		//soma
		double sum = 0;
		for(int i = 0; i <vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		
		//divisão
		double avg = sum / vect.length;
		
		System.out.println(avg);
		sc.close();

	}

}
