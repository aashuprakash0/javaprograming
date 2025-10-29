package pattern;
/*WAP TO PRINT
    5
   45
  345
 2345
12345
*/

public class p50 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		
		for (int i = 0; i <row; i++) {
			int num = 1+i; 
			for (int j = 0; j <coloumn; j++) {
				
				if((i+j)>=row-1) {
					System.out.print(num--);
					
					}
				else 
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
			
			
			
	}
}	
}