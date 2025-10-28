package pattern;
/*WAP TO PRINT
EEEEE
 DDDD
  CCC
   BB
    A
*/

public class p40 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		char ch='E';
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <coloumn; j++) {
				if(j<i) {
					System.out.print(" ");}
				else 
				{
					System.out.print(ch);
				}
			}
			System.out.println();
			ch--;
	}
}	
}