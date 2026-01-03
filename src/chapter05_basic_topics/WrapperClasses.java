package chapter05_basic_topics;

public class WrapperClasses {

	public static void main(String[] args) {
		/*
		 * Wrapper Classes São classes que "encapsulam" os tipos primitivos
		 */

		Integer intWrapper = 10;
		Double doubleWrapper = 25.50;
		Character charWrapper = 'A';
		Boolean booleanWrapper = true;

		System.out.println("Integer: " + intWrapper);
		System.out.println("Double: " + doubleWrapper);
		System.out.println("Character: " + charWrapper);
		System.out.println("Boolean: " + booleanWrapper);

		/*
		 * Conversão de String para número
		 */
		int number = Integer.parseInt("100");
		double price = Double.parseDouble("19.99");

		System.out.println("\nConversão de String:");
		System.out.println("int: " + number);
		System.out.println("double: " + price);

		/*
		 * Boxing (primitivo → wrapper)
		 */
		Integer boxed = 20; // autoboxing
		System.out.println("\nBoxing: " + boxed);

		/*
		 * Unboxing (wrapper → primitivo)
		 */
		int unboxed = boxed; // auto-unboxing
		System.out.println("Unboxing: " + unboxed);

		/*
		 * Comparação correta de wrappers
		 */
		Integer a = 128;
		Integer b = 128;

		System.out.println("\nComparação com equals:");
		System.out.println("a.equals(b): " + a.equals(b));

		/*
		 * Uso comum: coleções (List não aceita primitivos)
		 */
		java.util.List<Integer> numbers = new java.util.ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		System.out.println("\nLista de números:");
		for (Integer n : numbers) {
			System.out.println(n);
		}

	}

}
