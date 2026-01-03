package chapter05_basic_topics;

public class StringFunctions {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ADC abc DEFG";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("Substring(2): -" + s04 + "-");
		System.out.println("Substring (2, 9): -" + s05 + "-");
		System.out.println("Replace ('a', 'x'): -" + s06 + "-");
		System.out.println("Replace ('abc', 'xyz'): -" + s07 + "-");
		System.out.println("indexOf: -" + i + "-");
		System.out.println("lastIndexOf: -" + j + "-");

		/*
		 * Original: -abcde FGHIJ ADC abc DEFG- toLowerCase: -abcde fghij adc abc defg-
		 * toUpperCase: -ABCDE FGHIJ ADC ABC DEFG- Trim: -abcde FGHIJ ADC abc DEFG-
		 * Substring(2): -cde FGHIJ ADC abc DEFG- Substring (2, 9): -cde FGH- Replace
		 * ('a', 'x'): -xbcde FGHIJ ADC xbc DEFG- Replace ('abc', 'xyz'): -xyzde FGHIJ
		 * ADC xyz DEFG- indexOf: -1- (primeira vez que o 'bc' aparece é no caracter 1)
		 * lastIndexOf: -17- (ultima vez que o 'bc' aparece é no caracter 17)
		 */
	}

}
