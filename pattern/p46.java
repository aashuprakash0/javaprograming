package pattern;
/*WAP TO PRINT
    *
   **
  ***
 ****
*****
*/

public class p46 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <coloumn; j++) {
				
				if((i+j)>=row-1) {
					System.out.print('*');}
				else 
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
			
			
	}
}	
}