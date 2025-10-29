package pattern;
/* WAP TO PRINT
    0
   01
  010
 0101
01010
*/

public class p62 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 0; i < row; i++) {
            int num = 0; // start with 1 for each row
            for (int j = 0; j < column; j++) {
                if ((i + j) >= row - 1) {
                    System.out.print(num);
                    if (num == 0)
                        num = 1;
                    else
                        num = 0;
 // alternate between 0 and 1
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
