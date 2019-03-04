import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Euler8Soln {
    public static void main(String a[]) {
        String strLine = null;
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("EulerStuff/src/numbers.txt"));
            while ((strLine = br.readLine()) != null) {
                list.add(strLine);
            }
            br.close();



        } catch (IOException ex) {
            System.err.println(ex);
        }
        //About to create a string to put the 1000digit number.
        String bigNum = "";
        for (int i = 0; i < 20; i++) {
            bigNum += list.get(i);
        }
        //Finished putting the number in a string, about to check for the highest product.
        long maxProd = 1;
        String maxString = "";
        int range = bigNum.length();
        for (int i = 0; i < range; i++) {
            int itemp = i + 13; //for making it from i to the 13th number, i2 will be for my multiplying.
            long prodTemp = 1; //temporary product
            String aRandom = "";
            if (itemp <= range) {
                for (int i2 = i, j = i2 + 1; i2 < itemp; i2++, j++) {
                    prodTemp *= Integer.parseInt(bigNum.substring(i2, j));
                    aRandom += bigNum.substring(i2, j);
                }
                if (prodTemp > maxProd) {
                    maxProd = prodTemp;
                    maxString = aRandom;
                }
                ;  //shows the temporary product
            }
//	        	System.out.println(prodTemp);
        }
        System.out.println(maxProd);
        System.out.println(maxString);
//	        for (int i=0,j=1;i<4;i++,j++) {
//	        	prod *= Integer.parseInt(bigNum.substring(i,j));
//	        }


    }
}
