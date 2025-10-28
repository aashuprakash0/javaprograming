package pattern;
/*WAP TO PRINT
1
00
111
0000
11111
*/

public class p32 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // print 1 if (i + j) is even, else 0
                if (i % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}