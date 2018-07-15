import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Euler11Soln {
	public static void main (String[] args) {
		String strLine = null;
        List<String> list = new ArrayList<String>();
        try {
             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Owner\\desktop\\grid.txt"));
              while ((strLine = br.readLine()) != null) {
            	  list.add(strLine);
              }
              br.close();
               
                
        }
        catch (IOException ex) {
        	System.err.println(ex);
        }
        int[][] grid = new int[20][20];
        String gridNum = "";
        
        for (int i = 0; i<20;i++) {
        	gridNum += list.get(i);
        }
        gridNum = gridNum.replaceAll("\\s+",""); //I remove all the spaces in between the strings
        //Put all the numbers into the grid array
        for (int i = 0,row = 0; i < 800;i+=40,row++) {
        	
        	
        	for (int j=i,col=0; j < i+40; j+= 2,col++) { //J starts from i every iteration
        		grid[row][col] =  Integer.parseInt(gridNum.substring(j,j+2));
        	}
        	
        
        }
        int gridTransposed[][] = new int[20][20];
         for (int i = 0; i<grid.length;i++) {
        	 for (int j = 0; j <grid[0].length;j++) {
        		 gridTransposed[j][i] = grid[i][j];
        	 }
         }
//        for (int row = 0; row<20;row++) {
//        	for (int col = 0; col < 20; col++) {
//        		System.out.print(gridTransposed[row][col] + " ");
//        	}
//        	System.out.println();
//        }
//        Declare variables for hoirzontal,vertical and diagonal max, will compare them at the end.
        int maxProdVert = 1;
        int maxProdHori = 1;
        int maxProdDiag1 = 1;
        int maxProdDiag2 = 1;
        int[] arrMax = new int[4];
 
//        for horizontal max product
        for (int row = 0; row < 20;row++) {
        	
        	for (int col = 0; col < 16;col++) {
        		int horProd = 1;
        		for (int j = col;j<col+4;j++) {
        			horProd *= grid[row][j];
        		}
        		//System.out.println(horProd);
        		if (horProd > maxProdHori){
        			maxProdHori = horProd;
        		}
        	}
        	
        }
        //for vertical max product
		for (int row = 0; row < 20; row++) {

			for (int col = 0; col < 16; col++) {
				int verProd = 1;
				for (int j = col; j < col + 4; j++) {
					verProd *= gridTransposed[row][j];
				}
				// System.out.println(horProd);
				if (verProd > maxProdHori) {
					maxProdVert = verProd;
				}
			}

		}
		//For first diagonal
		int maxNum = 1;
		for (int row = 0; row <= 16;row++) {
			for (int col = 0; col <= 16; col++) {
				int prod = grid[row][col]*grid[row+1][col+1]*grid[row+2][col+2]*grid[row+3][col+3];
				if (prod > maxNum) {
					maxNum = prod;
				}
				
			}
			
		}
		//For second diagonal
		maxProdDiag1 = maxNum;
		for (int row = 19; row >= 3; row--) {
			for (int col = 0; col <= 16; col++) {
				int prod = grid[row][col]*grid[row-1][col+1]*grid[row-2][col+2]*grid[row-3][col+3];
				if (prod > maxProdDiag2) {
					maxProdDiag2 = prod;
				}
			}
		}
		arrMax[0] = maxProdHori;
		arrMax[1] = maxProdVert;
		arrMax[2] = maxProdDiag1;
		arrMax[3] = maxProdDiag2;
		int maximumProd = 0;
		for (int i =0; i <arrMax.length;i++) {
			if (arrMax[i] > maximumProd) {
				maximumProd = arrMax[i];
			}
		}
		System.out.println(maximumProd);
		
//		for (int i = 0; i <= 16; i++) {
//			for (int j = 0 ; j <=16; j++) {
//				int diag1 = 1;
//				for (int k = j,i2 = i; k < j+4;k++,i2++) {
//					diag1 *= grid[i2][k];
//				}
//				if (diag1 > maxProdDiag1) {
//					maxProdDiag1 = diag1;
//				}
//			}
//		}
		System.out.println("Hello world");


	
		 
         
        
        

        
		
	}

}
