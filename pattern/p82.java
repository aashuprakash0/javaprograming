package pattern;
/* WAP TO PRINT
10101
0101
101
01
1
*/

public class p82 {
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
                if (j < column - i) { // controls decreasing number of columns
                    System.out.print(num);    
                } else {
                    System.out.print(" "); // optional: for spacing
                }
            }
            System.out.println();
        }
    }
}

