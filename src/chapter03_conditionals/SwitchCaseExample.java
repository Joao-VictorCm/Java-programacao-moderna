package chapter03_conditionals;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Problema exemplo:
		 * 
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representado um dia da
		 * semana (sendo 1= domingo, 2= segunda...) Escerver na tela o dia da semana
		 * correspondente, conforme exemplo
		 * 
		 * entrada: 1 saida: dia da semana: Domingo
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero de 1 a 7:");
		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Domingo";
			break;

		default:
			dia = "NUmero invalido";
			break;

		}

		System.out.println("Dia da semana: " + dia);
		sc.close();

	}
	

}
