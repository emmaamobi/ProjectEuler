public class Euler4 {
//    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//    Find the largest palindrome made from the product of two 3-digit numbers.
    public static void main (String[] args){
        int maxProd = 0;
        for (int i=100;i<1000;i++){
            for (int j=i;j<1000;j++){
                if (isPalindrome(i*j)){
                    if ((i*j) > maxProd){
                        maxProd = i*j;
                    }
                }
            }
        }
        System.out.println(maxProd);


    }
    public static boolean isPalindrome(int number){
        String strNum = Integer.toString(number);
        return strNum.equals(reverseStr(strNum));
    }

    public static String reverseStr(String original) {
        String reverse = "";
        int length = original.length();
        for (int i = length-1;i>=0;i--) {
            reverse = reverse + original.charAt(i);
        }
        return reverse;
    }

}
