import java.util.ArrayList;
public class euler23 {
	public static void main(String[] args) {
		ArrayList<Integer> abuNums = new ArrayList<>();
		for (int i = 12;i<28123;i++) {
			if (isAbundantNum(i)) {
				abuNums.add(i);
			}
		}
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0;i<12;i++) {
			nums.add(i);
		}
		
		System.out.println(abuNums.size());
		System.out.println("Hello world");
		System.out.println("hello world");

	}
	public static boolean isPerfectNum(int num) {
		int sum = 0;
		for (int i=1;i<=num/2;i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}
	public static boolean isDeficientNum(int num) {
		int sum = 0;
		for (int i=1;i<=num/2;i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum < num;
	}
	public static boolean isAbundantNum(int num) {
		int sum = 0;
		for (int i=1;i<=num/2;i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum > num;
	}

}
