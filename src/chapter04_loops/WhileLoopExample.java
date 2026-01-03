package chapter04_loops;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		//Regra se for Verdadeira executa e volta se for False pula fora
		// Exemplo de while com break
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Digite um numero inteiro:");
			int N = sc.nextInt();

			if (N == 0) {
				System.out.println("Encerrando o programa...");
				break; // sai do while imediatamente
			}
			if (N % 2 == 0) {
				int soma = (N + (N + 2) + (N + 4) + (N + 6) + (N + 8));
				System.out.println("SOMA: " + soma);
			} else {
				N++;
				int soma = (N + (N + 2) + (N + 4) + (N + 6) + (N + 8));
				System.out.println("SOMA: " + soma);
			}
			sc.close();
		}

	}

}
