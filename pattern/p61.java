package pattern;
/* WAP TO PRINT
     1
    10
   101
  1010
 10101
*/

public class p61 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 0; i < row; i++) {
            int num = 1; // start with 1 for each row
            for (int j = 0; j < column; j++) {
                if ((i + j) >= row - 1) {
                    System.out.print(num);
                    if (num == 1)
                        num = 0;
                    else
                        num = 1;
 // alternate between 1 and 0
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
