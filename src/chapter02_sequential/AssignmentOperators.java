package chapter02_sequential;

public class AssignmentOperators {

	public static void main(String[] args) {
	      // Operador de atribuição simples
        int x = 10;
        System.out.println("Valor inicial de x: " + x);

        // Atribuição com soma (x = x + 5)
        x += 5;
        System.out.println("Após x += 5 → " + x);

        // Atribuição com subtração (x = x - 3)
        x -= 3;
        System.out.println("Após x -= 3 → " + x);

        // Atribuição com multiplicação (x = x * 2)
        x *= 2;
        System.out.println("Após x *= 2 → " + x);

        // Atribuição com divisão (x = x / 4)
        x /= 4;
        System.out.println("Após x /= 4 → " + x);

        // Atribuição com resto da divisão (módulo)
        x %= 3;
        System.out.println("Após x %= 3 → " + x);

        // Exemplo com double
        double price = 100.0;
        System.out.println("\nPreço inicial: " + price);

        price *= 1.10; // aumento de 10%
        System.out.println("Após aumento de 10%: " + price);

        price -= 15.0; // desconto fixo
        System.out.println("Após desconto de 15: " + price);

	}

}
