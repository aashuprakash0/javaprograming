package pattern;
/* WAP TO PRINT
   1
  212
 32123
4321234
 32123
  212
   1
*/

public class p121 {
	public static void main(String[] args) {
        int row = 7;
        int no_char = 1;
        int no_space =row/2;
       
        for (int i = 0; i < row; i++) {
        	int num=1+no_char/2;
            for (int j = 0; j < no_space; j++) {
                    System.out.print(' '); 
            }
            for (int k = 0; k < no_char; k++) {
            	if(k<no_char/2)
            		System.out.print(num--);
            	else 
            		System.out.print(num++);
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

