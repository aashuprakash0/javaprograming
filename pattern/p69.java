package pattern;
/* WAP TO PRINT
ABCDE
ABCD 
ABC  
AB   
A     
*/

public class p69 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for (int i = 0; i < row; i++) { 
        	 char ch='A';
            for (int j = 0; j < column; j++) {
                if ((i + j) <= row - 1) {
                    System.out.print(ch++);
                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        
        }
    }
}
