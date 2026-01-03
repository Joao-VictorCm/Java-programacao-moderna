package chapter04_loops;

import java.util.Scanner;

public class LoopExercises {

	public static void main(String[] args) {
		/*
		 * PARTE 1: estrutura while (enquanto) 1: Problema "crescente"
		 */

		Scanner sc = new Scanner(System.in);
		/*
		 * int A; int B; String resp;
		 * 
		 * do { System.out.print("Digite dois numeros:"); A = sc.nextInt(); B =
		 * sc.nextInt(); if (A != B) { resp = (A < B) ? "CRESCENTE" : "DECRESCENTE";
		 * System.out.println(resp); } } while (A != B);
		 * -------------------------------------------------------------------------
		 */

		/*
		 * Problema "media_idades"
		 * 
		 * int idade, npessoas; double soma, media;
		 * 
		 * System.out.println("Digite as idades:"); idade = sc.nextInt();
		 * 
		 * if (idade < 0) { System.out.println("IMPOSSIVEL CALCULAR"); } else { soma =
		 * 0; npessoas = 0; while (idade >= 0) { soma = soma + idade; npessoas++; idade
		 * = sc.nextInt(); }
		 * 
		 * media = soma / npessoas;
		 * 
		 * System.out.printf("MEDIA = %.2f\n", media); }
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * Problema "senha_fixa
		 * 
		 * System.out.println("Digite sua senha:"); int senha = sc.nextInt();
		 * 
		 * while (senha != 2312) {
		 * System.out.println("Senha invalida! Tente novamente:"+ senha); senha =
		 * sc.nextInt();
		 * 
		 * } System.out.println("Acesso permitido!");
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * Problema "quadrante"
		 * 
		 * Q1 → X > 0 e Y > 0 Q2 → X < 0 e Y > 0 Q3 → X < 0 e Y < 0 Q4 → X > 0 e Y < 0
		 * 
		 * System.out.println("Digite os valores das coordenadas X e Y:"); int X =
		 * sc.nextInt(); int Y = sc.nextInt();
		 * 
		 * while (X != 0 && Y != 0 ) { if(X > 0 && Y > 0) {
		 * System.out.println("QUADRANTE Q1");
		 * System.out.println("Digite os valores das coordenadas X e Y:"); X =
		 * sc.nextInt(); Y = sc.nextInt(); }else if(X < 0 && Y > 0) {
		 * System.out.println("QUADRANTE Q2");
		 * System.out.println("Digite os valores das coordenadas X e Y:"); X =
		 * sc.nextInt(); Y = sc.nextInt(); }else if(X < 0 && Y <0) {
		 * System.out.println("QUADRANTE Q3");
		 * System.out.println("Digite os valores das coordenadas X e Y:"); X =
		 * sc.nextInt(); Y = sc.nextInt(); }else if(X > 0 && Y < 0) {
		 * System.out.println("QUADRANTE Q4");
		 * System.out.println("Digite os valores das coordenadas X e Y:"); X =
		 * sc.nextInt(); Y = sc.nextInt(); } }
		 * 
		 * ------------------------------------------------------------------------
		 * 
		 * Problema "validacao_de_nota"
		 * 
		 * 
		 * System.out.print("Digite a primeira nota:"); double nota1 = sc.nextDouble();
		 * 
		 * while(nota1 < 0 || nota1 > 10) {
		 * System.out.println("Valor invalido! Tente novamente:"); nota1 =
		 * sc.nextDouble(); }
		 * 
		 * System.out.print("Digite a segunda nota:"); double nota2 = sc.nextDouble();
		 * while(nota2 < 0 || nota2 > 10) {
		 * System.out.println("Valor invalido! Tente novamente:"); nota2 =
		 * sc.nextDouble(); }
		 * 
		 * double mediaNota = (nota1 + nota2) / 2; System.out.println("MEDIA: "
		 * +mediaNota);
		 * 
		 * ------------------------------------------------------------------------
		 * 
		 * Problema "combustivel"
		 * 
		 * 
		 * int alcool = 0; int gasolina = 0; int diesel = 0; int codigo = 0;
		 * 
		 * while (codigo != 4) {
		 * System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:"); codigo =
		 * sc.nextInt(); switch (codigo) { case 1: alcool++; break; case 2: gasolina++;
		 * break; case 3: diesel++; break; }
		 * 
		 * } System.out.println("MUITO OBRIGADO"); System.out.println("Alcool: " +
		 * alcool); System.out.println("Gasolina: "+gasolina);
		 * System.out.println("Diesel: "+diesel);
		 * 
		 * ------------------------------------------------------------------------
		 * 
		 * Problema "pares_consecutivos"
		 * 
		 * 
		 * while(true) { System.out.print("Digite um numero inteiro:"); int N =
		 * sc.nextInt();
		 * 
		 * if (N == 0) { System.out.println("Encerrando o programa..."); break; // sai
		 * do while imediatamente } if(N % 2 == 0) { int soma = (N + (N+2) + (N+4) +
		 * (N+6) + (N+8)); System.out.println("SOMA: " +soma); }else { N++; int soma =
		 * (N + (N+2) + (N+4) + (N+6) + (N+8)); System.out.println("SOMA: " +soma); } }
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * PARTE 2: estrutura for (para) Problema "tabuada"
		 * 
		 * 
		 * System.out.print("Deseja a tabuada para qual valor?"); int tabuada =
		 * sc.nextInt();
		 * 
		 * 
		 * for(int i = 0; i < 11; i++) { int resultado = tabuada * i;
		 * System.out.println(resultado); }
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * Problema "soma impares"
		 * 
		 * int N1 = 6; int N2 = -5;
		 * 
		 * int menor, maior;
		 * 
		 * if (N1 < N2) { menor = N1; maior = N2; } else { menor = N2; maior = N1; }
		 * 
		 * int soma = 0;
		 * 
		 * for (int i = menor + 1; i < maior; i++) { if (i % 2 != 0) { soma = soma + i;
		 * } }
		 * 
		 * System.out.println("SOMA DOS ÍMPARES = " + soma);
		 * 
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * Problema "dentro_fora" intervalo [10,20]
		 */

		int n, x, fora, dentro;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		fora = 0;
		dentro = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();

			if (x < 10 || x > 20) {
				fora++;
			} else {
				dentro++;
			}
		}

		System.out.printf("%d DENTRO\n", dentro);
		System.out.printf("%d FORA\n", fora);

		sc.close();

	}

}
