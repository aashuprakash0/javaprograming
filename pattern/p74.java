package pattern;
/* WAP TO PRINT
11111
2222 
333  
44   
5        
*/

public class p74 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        int num=1;
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < column; j++) {
                if ((i + j) <= row - 1) {
                    System.out.print(num);
                   
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            num++;
        }
    }
}
