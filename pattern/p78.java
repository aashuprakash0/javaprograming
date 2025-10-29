package pattern;
/* WAP TO PRINT
12345
2345 
345  
45   
5
*/

public class p78 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        
        for (int i = 0; i < row; i++) {
        	int num = 1 +i;
            for (int j = 0; j < column; j++) {
                if ((i + j) <= row - 1) {
                    System.out.print(num++);
                   
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}