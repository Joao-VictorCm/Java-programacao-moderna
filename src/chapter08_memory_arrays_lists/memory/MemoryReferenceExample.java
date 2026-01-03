package chapter08_memory_arrays_lists.memory;

public class MemoryReferenceExample {

	public static void main(String[] args) {

        int a = 10;
        int b = a;

        b = 20;

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        int[] vectA = {1, 2, 3};
        int[] vectB = vectA;

        vectB[0] = 99;

        System.out.println("vectA[0] = " + vectA[0]); // 99
        System.out.println("vectB[0] = " + vectB[0]); // 99

	}

}
