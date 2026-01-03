package chapter02_sequential;

import java.util.Locale;
import java.util.Scanner;

public class SequentialExercises {

	public static void main(String[] args) {
		   Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);

	        // Exercício 1: soma de dois números
	        System.out.print("Digite o primeiro número: ");
	        int a = sc.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int b = sc.nextInt();

	        int sum = a + b;
	        System.out.println("Soma = " + sum);

	        // Exercício 2: área de um retângulo
	        System.out.print("\nDigite a largura do retângulo: ");
	        double width = sc.nextDouble();

	        System.out.print("Digite a altura do retângulo: ");
	        double height = sc.nextDouble();

	        double area = width * height;
	        System.out.println("Área do retângulo = " + area);

	        sc.close();

	}

}
