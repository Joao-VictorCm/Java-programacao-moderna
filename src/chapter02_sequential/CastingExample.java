package chapter02_sequential;

public class CastingExample {

	public static void main(String[] args) {
		  // Casting implícito (automático)
        int a = 10;
        double b = a;

        System.out.println("Casting implícito:");
        System.out.println("int a = " + a);
        System.out.println("double b = " + b);

        // Casting explícito (manual)
        double x = 9.75;
        int y = (int) x;

        System.out.println("\nCasting explícito:");
        System.out.println("double x = " + x);
        System.out.println("int y = " + y);

        // Exemplo comum
        int num1 = 5;
        int num2 = 2;

        double result = (double) num1 / num2;
        System.out.println("\nResultado correto da divisão: " + result);

	}

}
