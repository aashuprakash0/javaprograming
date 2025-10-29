package pattern;
/*WAP TO PRINT
    E
   DD
  CCC
 BBBB
AAAAA
*/

public class p52 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		char ch='E';
		for (int i = 0; i <row; i++) { 
			for (int j = 0; j <coloumn; j++) {
				
				if((i+j)>=row-1) {
					System.out.print(ch);
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