package pattern;
/*WAP TO PRINT
   A
   AB
  ABC
 ABCD
ABCDE
*/

public class p48 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		
		for (int i = 0; i <row; i++) {
			char ch=(char)('A'+i);
			for (int j = 0; j <coloumn; j++) {
				
				if((i+j)>=row-1) {
					System.out.print(ch--);
					
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