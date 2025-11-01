package pattern;
/* WAP TO PRINT
   A
  BBB
 CCCCC
DDDDDDD
 EEEEE
  FFF
   G
*/

public class p116 {
	public static void main(String[] args) {
        int row = 7;
        int no_char = 1;
        int no_space =row/2;
        char ch='D';
        for (int i = 0; i < row; i++) {
        	
            for (int j = 0; j < no_space; j++) {
                    System.out.print(' '); 
            }
            for (int k = 0; k < no_char; k++) {
            	System.out.print(ch);
            	}	
            System.out.println();
            if (i<row/2) {	
        	no_char+=2;
            no_space--;
            ch--;}
        	else {
        		no_space++;
        		no_char-=2;
        		ch++;
        	}
          
        		
        	}
            
        }
    }

