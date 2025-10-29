package pattern;
/*WAP TO PRINT
    E
   ED
  EDC
 EDCB
EDCBA
*/

public class p56 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 0; i <row; i++) {
			char ch = 'E';
			for (int j = 0; j <coloumn; j++) {
				
				if((i+j)>=row-1) {
					System.out.print(ch);
					ch--;
					}
				else 
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
			ch--;
	}
}	
}