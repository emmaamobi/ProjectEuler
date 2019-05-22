import java.util.stream.IntStream;

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below 1000.
public class Euler1 {
	public static void main (String[] args) {
		int sum = 0;
		for (int i = 3; i<1000;i++) {
			if (i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		// using new Java streams
		System.out.println(IntStream.range(1,1000).filter(x -> x % 3 == 0 || x % 5 == 0).sum());
		

	}

}
