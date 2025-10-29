package pattern;
/* WAP TO PRINT
*****
**** 
***  
**   
*
*/

public class p64 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 0; i < row; i++) {       
            for (int j = 0; j < column; j++) {
                if ((i + j) <= row - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
