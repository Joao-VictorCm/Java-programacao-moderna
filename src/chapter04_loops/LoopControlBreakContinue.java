package chapter04_loops;

import java.util.Scanner;

public class LoopControlBreakContinue {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        /*
         * =========================
         * EXEMPLO 1 - for
         */
        System.out.println("Exemplo com for:");
        for (int i = 1; i <= 5; i++) {

            if (i == 4) {
                System.out.println("Break acionado no i = " + i);
                break;
            }

            System.out.println("i = " + i);
        }

        /*
         * =========================
         * EXEMPLO 2 - continue
         * =========================
         */
        System.out.println("\nExemplo com continue:");
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                System.out.println("Continue acionado no i = " + i);
                continue;
            }

            System.out.println("i = " + i);
        }

        /*
         * =========================
         * EXEMPLO 3 - while
         * =========================
         */
        System.out.println("\nExemplo com while:");
        int number;

        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            number = sc.nextInt();

            if (number == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (number < 0) {
                System.out.println("Número negativo ignorado");
                continue;
            }

            System.out.println("Número válido: " + number);
        }

        /*
         * =========================
         * EXEMPLO 4 - do while
         * =========================
         */
        System.out.println("\nExemplo com do-while:");
        int count = 0;

        do {
            count++;

            if (count == 2) {
                System.out.println("Pulando o valor 2");
                continue;
            }

            System.out.println("Contador: " + count);

        } while (count < 3);

        sc.close();

	}

}
