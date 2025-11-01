package pattern;
/* WAP TO PRINT
   A
  ABA
 ABCAB
ABCDABC
 ABCAB
  ABA
   A
*/

public class p120 {
	public static void main(String[] args) {
        int row = 7;
        int no_char = 1;
        int no_space =row/2;
       
        for (int i = 0; i < row; i++) {
        	char ch='A';
            for (int j = 0; j < no_space; j++) {
                    System.out.print(' '); 
            }
            for (int k = 0; k < no_char; k++) {
            	System.out.print(ch);
            	if(k<no_char/2) {
            	ch++;	
            	}else 
            		ch--;
    			}		
            System.out.println();
            if (i <row/2) {	
        	no_char+=2;
            no_space--;
          
            }
        	else {
        		no_space++;
        		no_char-=2;
        
        	}
            
          
        		
        	}
            
        }
    }

