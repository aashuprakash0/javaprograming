package pattern;
/* WAP TO PRINT
54321
5432 
543  
54   
5      
*/

public class p71 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 0; i < row; i++) { 
        	 int num=5;
            for (int j = 0; j < column; j++) {
                if ((i + j) <= row - 1) {
                    System.out.print(num--);
                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        
        }
    }
}
