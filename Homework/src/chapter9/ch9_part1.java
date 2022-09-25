package chapter9;

import java.util.function.IntConsumer;

class EvenNumberOperations {
    private static int total;
	private static int product = 1;
	private static int[] squares = new int[5];

	public static void main(String[] args) {
		pickEvenNumber(10, (i) -> System.out.print(i + " "));

		pickEvenNumber(10, (i) -> total += i);
		System.out.println("Sum: " + total);

		pickEvenNumber(10, (i) -> product *= i);
		System.out.println("Product: " + product);
		
		pickEvenNumber(10, (i) -> {
			squares[i/2-1] = i * i;
		});
		
		System.out.print("Squares: ");
		for(int i : squares)
			System.out.print(i + " ");
	}

	public static void pickEvenNumber(int n, IntConsumer operation) {
		for (int i = 2; i <= n; i += 2) 
			operation.accept(i);
	}
}