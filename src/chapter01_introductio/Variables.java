package chapter01_introductio;

public class Variables {

	public static void main(String[] args) {
		   String name = "João";
	        int age = 22;
	        double monthlyIncome = 1800.00;

	        System.out.println("Nome: " + name);
	        System.out.println("Idade: " + age);
	        System.out.println("Renda mensal: " + monthlyIncome);

	        // Alterando valores
	        age = 23;
	        monthlyIncome = 2000.00;

	        System.out.println("\nApós atualização:");
	        System.out.println("Nova idade: " + age);
	        System.out.println("Nova renda mensal: " + monthlyIncome);

	}

}
