import java.math.BigInteger;

public class euler20 {
	public static void main (String[] args) {
		BigInteger prod = new BigInteger("1");
		for (int i=0;i<100;i++) {
//			System.out.print(100-i + " ");
			prod = prod.multiply(new BigInteger((100-i) + "")); 
		}
		String num = prod.toString();
		int sum = 0;
		for (int i =0;i<num.length();i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		System.out.println(sum);
		
		
		
	}
}
