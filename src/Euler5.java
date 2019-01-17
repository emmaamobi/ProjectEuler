
public class Euler5 {
	public static void main(String[] args) {
//		System.out.println("Hello world");
		int ans = 1;
		for (int i= 1;i<=20;i++) {
            ans = lcm(ans,i);
		}
		System.out.println(ans);

		

		System.out.println("Hello world ");
	}


	public static int gcd (int a, int b){
		while (b > 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	public static int lcm(int a, int b){
		return a * (b / gcd(a,b));

	}

}
