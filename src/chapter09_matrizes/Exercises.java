package chapter09_matrizes;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um numero inteiro N e uma matriz de ordem N contendo números inteiros.
		 * Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz
		 */

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//Instanciando a matriz binimencional
		int[][] mat= new int[n][n];
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("main diagonal");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		
		for(int i=0; i <mat.length; i++) { //percore as linhas
			for(int j=0; j<mat[i].length; j++) { //percorre as colunas
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers: "+count );
		
		
		sc.close();
	}

}
