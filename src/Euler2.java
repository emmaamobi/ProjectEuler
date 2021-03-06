/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Euler2 {
	
	public static int recurfib(int n) {
		if (n == 0) {
			return 1;
		}
		if( n == 1) {
			return 2;
		}
		return (recurfib(n-1) + recurfib(n-2));
	}
	public static int fib(int n) {
		if (n == 0) {
			return 1;
		}
		else if (n == 1) {
			return 2;
		}
		int ans = 0;
		int prePrev = 1;
		int prev = 2;

		for (int i = 2; i <= n ; i++ ) {
			ans = prev + prePrev;
			prePrev = prev;
			prev = ans;
		}
		return ans; 
		
	}
	public static void main (String[] args) {
		 System.out.println(recurfib(50));
		 System.out.println(fib(50));

		boolean notUpto4m = true;
		int sum = 0;
		int i = 0;
		while (fib(i) <= 4000000) {
			if (fib(i) % 2 == 0) {
				sum += fib(i);
			}
			i++;


		}
		System.out.println(sum);
        System.out.println("[ Testing out a surround thing ]");

		
	}

}
