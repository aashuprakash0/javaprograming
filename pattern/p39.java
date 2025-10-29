package pattern;
/*WAP TO PRINT
AAAAA
 BBBB
  CCC
   DD
    E
*/

public class p39 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		char ch='A';
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
			ch++;
	}
}	
}