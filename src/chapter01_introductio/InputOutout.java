package chapter01_introductio;

import java.util.Locale;
import java.util.Scanner;

public class InputOutout {

	public static void main(String[] args) {
		   Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite seu nome: ");
	        String name = sc.nextLine();

	        System.out.print("Digite sua idade: ");
	        int age = sc.nextInt();

	        System.out.print("Digite sua renda mensal: ");
	        double income = sc.nextDouble();

	        System.out.println("\n=== Dados informados ===");
	        System.out.println("Nome: " + name);
	        System.out.println("Idade: " + age);
	        System.out.println("Renda mensal: " + income);

	        sc.close();
	}

}
