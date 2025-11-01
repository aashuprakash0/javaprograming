package pattern;
/* WAP TO PRINT
   1
  000
 11111
0000000
 11111
  000
   1
   1
*/

public class p124 {
	public static void main(String[] args) {
        int row = 7;
        int no_char = 1;
        int no_space =row/2;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < no_space; j++) {
                    System.out.print(' '); 
            }
            int digit;
            if (i % 2 == 0) {
                digit = 1;
            } else {
                digit = 0;
            }
            for (int k = 0; k < no_char; k++) {
            	System.out.print(digit);
    			}		
            System.out.println();
            if (i <row/2) {	
        	no_char+=2;
            no_space--;
          
            }
        	else {
        		no_space++;
        		no_char-=2;}      
        	}          
        }
    }

