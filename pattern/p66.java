package pattern;
/* WAP TO PRINT
EEEEE
DDDD 
CCC  
BB   
A 
*/

public class p66 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        char ch='E';
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < column; j++) {
                if ((i + j) <= row - 1) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            ch--;
        }
    }
}
