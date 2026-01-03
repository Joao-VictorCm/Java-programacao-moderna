package chapter02_sequential;

import java.util.Locale;
import java.util.Scanner;

public class FormattedOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Digitou: " +x);
		sc.close();
		
		
		
		//Para ler um número inteiro(int)
		Scanner scInt = new Scanner(System.in);
		int exInt;
		exInt = scInt.nextInt();
		System.out.println("Seu numero digitado foi: " +exInt);
		scInt.close();
		
		
	
		/*Para ler um número com casas dps da virgula (Double)
		Neste caso usaria o . pois esta na localidade do US */
		
		Locale.setDefault(Locale.US);
		Scanner sdouble = new Scanner(System.in);
		double exDouble;
		exDouble = sdouble.nextDouble();
		System.out.println("Seu numero digitado foi: " +exDouble);
		sdouble.close();
		
	
    //Para ler apenas um caracter (neste caso o primeiro pois foi definido com 0)
		Scanner sc02 = new Scanner(System.in);
		char xchar;
		xchar = sc02.next().charAt(0);
		
		System.out.println("Você digitou: "+ xchar);		
		sc02.close();
		
		//Para ler varios dados
		
		Scanner newSc = new Scanner(System.in);
		
		String x1;
		int y;
		double z;
		
		x1 = newSc.next();
		y = newSc.nextInt();
		z = newSc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x1);
		System.out.println(y);
		System.out.println(z);
		
		newSc.close();
		
		
	//Para ler um texto ATÉ A QUEBRA DE LINHA
		
		Scanner scQuebaLinha = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = scQuebaLinha.nextLine();
		s2 = scQuebaLinha.nextLine();
		s3 = scQuebaLinha.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		scQuebaLinha.close();

	}

}
