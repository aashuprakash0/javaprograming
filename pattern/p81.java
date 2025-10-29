package pattern;
/* WAP TO PRINT
10101
1010 
101  
10   
1 
*/

public class p81 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 0; i < row; i++) {
        	int num=1;            
            for (int j = 0; j < column; j++) {
                if (j < column - i) { // controls decreasing number of columns
                    System.out.print(num);
                    num = (num == 1) ? 0 : 1; // toggle 1 ↔ 0
                } else {
                    System.out.print(" "); // optional: for spacing
                }
            }
            System.out.println();
        }
    }
}

