package chapter01_introductio;

import java.util.Locale;

public class JavaStructure {

	public static void main(String[] args) {
		// Declarando variáveis
		int inteiro = 30;
		double casaDpsDaVirgula = 7.45646;
		System.out.println(inteiro);
		System.out.println(casaDpsDaVirgula);
		
		
		//Formatando variaveis
		System.out.printf("%.2f%n", casaDpsDaVirgula); //Saida 7,46 (e não 7.45646)
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", casaDpsDaVirgula); //mesma coisa só que com 4 casas decimais e o . no lugar da ,
		
		
		//Contatenando variaveis
		System.out.println("Resultado = " +inteiro+ " metros");
		System.out.printf("Resultado = %.2f metros%n", casaDpsDaVirgula);
		
		//Contatenar varias variaveis
		String nome = "Maria";
		int idade = 31;
		double renda = 4500.56;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}

}
