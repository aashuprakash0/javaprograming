package pattern;
/* WAP TO PRINT
 *******
  *****
   ***
    *
   ***
  *****
 *******
*/

public class p126 {
	public static void main(String[] args) {
        int row = 7;
        int no_char = row;
        int no_space =0;
        
        for (int i = 0; i < row; i++) {
        	
            for (int j = 0; j < no_space; j++) {
                    System.out.print(' '); 
            }
            for (int k = 0; k < no_char; k++) {
            	System.out.print('*');
            	}	
            System.out.println();
            if (i>=row/2) {	
        	no_char+=2;
            no_space--;}
        	else {
        		no_space++;
        		no_char-=2;
        	}
        		
        	}
            
        }
    }

