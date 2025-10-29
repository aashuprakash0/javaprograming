package pattern;
/* WAP TO PRINT
     1
    00
   111
  0000
 11111
*/

public class p63 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 0; i < row; i++) {
        	int num;  
             // For even rows (0, 2, 4 → 1st, 3rd, 5th), print 1
            // For odd rows (1, 3 → 2nd, 4th), print 0
            if (i % 2 == 0)
                num = 1;
            else
                num = 0;
            
            for (int j = 0; j < column; j++) {
                if ((i + j) >= row - 1) {
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
