package chapter02_sequential;

import java.util.Locale;
import java.util.Scanner;

public class SequentialExercises {

	public static void main(String[] args) {
		/*
		 * 1. O coração humano bate em média uma vez por segundo. Desenvolver um
		 * algoritmo para calcular e escrever quantas vezes o coração de uma pessoa
		 * baterá se viver X anos. Dados de entrada: idade da pessoa (inteiro em anos).
		 * Considerações: 1 anos = 365,25 dias, 1 dia = 24 horas, 1 hora = 60 minutos e
		 * 1 minuto = 60 segundos. Exemplo Entrada 42 Saída O CORACAO BATEU 1.3254192E9
		 * VEZES
		 * 
		 * double hora = 1.0; double dia = 24.0; double ano = 365.25;
		 * 
		 * double x = hora * (60.0 * 60); double y = dia * x; double z = ano * y;
		 * 
		 * Scanner sc = new Scanner(System.in); int anoDigitado; anoDigitado =
		 * sc.nextInt();
		 * 
		 * double resultado = z * 42;
		 * 
		 * System.out.println("Seu coração bateu " + resultado + " vezes durante " +
		 * anoDigitado + " anos");
		 * 
		 * sc.close();
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * 2. Um fabricante de latas deseja desenvolver um algoritmo para calcular o
		 * custo de uma lata cilíndrica de alumínio, sabendo­se que o custo do alumínio
		 * por m² é R$ 100,00. Dados de entrada: raio e altura da lata (em metros).
		 * Arealata=Areabase π *r2∗2 +Arealado  2 * *r*h π  considere o preço do
		 * alumínio por m² como sendo uma constante.
		 * 
		 * Scanner sc = new Scanner(System.in); int raio; int altura;
		 * System.out.println("Raio:"); raio = sc.nextInt();
		 * System.out.println("Altura"); altura = sc.nextInt();
		 * 
		 * double raioElevadoaoQuadrado = Math.pow(raio, 2.0); double areaBase = Math.PI
		 * * raioElevadoaoQuadrado * 2.0; double areaLateral = 2.0 * Math.PI * 6.0 *
		 * altura;
		 * 
		 * double result = (areaBase + areaLateral) * 100;
		 * 
		 * System.out.println("Valor do custo é " + result);
		 * 
		 * sc.close();
		 * 
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * 3. Teorema de Pitágoras: H² = L1² + L2² . Tem uma infinidade de números com
		 * essa combinação. Dado dois números inteiros positivos, M e N, onde M>N,
		 * desenvolver um algoritmo para entrar com dois números positivos e fornecer os
		 * valores dos lados e da Hipotenusa do triângulo gerados combinando M e N.
		 * L1=M2−N 2 ,L 2=2 *M*N, Hipotenusa = M² + N²
		 * 
		 * 
		 * Scanner ex03 = new Scanner(System.in); int M; int N;
		 * 
		 * M = ex03.nextInt(); N = ex03.nextInt();
		 * 
		 * double L1 = Math.pow(M, 2.0) - Math.pow(N, 2.0); double L2 = 2 * M * N;
		 * double hipotenusa = Math.pow(M, 2.0) + Math.pow(N, 2.0);
		 * System.out.println("L1 " + L1); System.out.println("L2 " + L2);
		 * System.out.println("Hipotenusa " + hipotenusa);
		 * 
		 * ex03.close();
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * 4. Muitos países estão passando a utilizar o sistema métrico. Fazer um
		 * algoritmo para executar as seguintes conversões: • Ler uma temperatura em e
		 * imprimir o equivalente em Celsius (F = 9/5 * C + 32) (C = (F – 32)/1,8),
		 * considerando C e F os valores Celsius e Fahrenheit, respectivamente. • Ler
		 * uma quantidade de chuva dada em polegadas e imprimir o equivalFahrenheitente
		 * em milímetros (1 polegada = 25,4 mm).
		 * 
		 * 
		 * Scanner ex04 = new Scanner(System.in);
		 * 
		 * int Fahrenheit; int polegadas; System.out.
		 * println("Digite a temperatura em Fahrenheit para converter em Celsius");
		 * Fahrenheit = ex04.nextInt(); System.out.
		 * println("Digite a quantidade de chuvas a ser convertida de polegadas para mm"
		 * ); polegadas = ex04.nextInt(); double C = (Fahrenheit - 32) / 1.8; double D =
		 * polegadas * 25.4; System.out.println(Fahrenheit + " Fahrenheit são " +C +
		 * "° celsis"); System.out.println("Quantidade de chuva em mm é " + D);
		 * 
		 * -----------------------------------------------------------------------------
		 * 
		 * Fazer um programa para ler os valores dos coeficientes A, B e C de uma
		 * equação quadrática e calcular e imprimir o valor do discriminante (delta).
		 * ∆= B² – 4 * A * C
		 * A = 5
		 * B = 12
		 * C = 4
		 */
		
		int A = 5;
		int B = 12;
		int C = 45;
		
		double result = Math.pow(B, 2.0) - 4 * A * C;
		
		System.out.print(result);

	}

}
