package chapter05_basic_topics;

public class BitwiseOperators {

	public static void main(String[] args) {

		int a = 10; // 1010 em binário
		int b = 6; // 0110 em binário

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		/*
		 * AND bit a bit (&) Compara cada bit: 1 se ambos forem 1
		 */
		int andResult = a & b;
		System.out.println("\na & b = " + andResult);

		/*
		 * OR bit a bit (|) Compara cada bit: 1 se pelo menos um for 1
		 */
		int orResult = a | b;
		System.out.println("a | b = " + orResult);

		/*
		 * XOR bit a bit (^) 1 se os bits forem diferentes
		 */
		int xorResult = a ^ b;
		System.out.println("a ^ b = " + xorResult);

		/*
		 * NOT (~) Inverte todos os bits
		 */
		int notResult = ~a;
		System.out.println("~a = " + notResult);

		/*
		 * Deslocamento para a esquerda (<<) Multiplica por 2 a cada deslocamento
		 */
		int leftShift = a << 1;
		System.out.println("\na << 1 = " + leftShift);

		/*
		 * Deslocamento para a direita (>>) Divide por 2 a cada deslocamento
		 */
		int rightShift = a >> 1;
		System.out.println("a >> 1 = " + rightShift);

		/*
		 * Deslocamento para a direita sem sinal (>>>)
		 */
		int unsignedRightShift = a >>> 1;
		System.out.println("a >>> 1 = " + unsignedRightShift);

	}

}
