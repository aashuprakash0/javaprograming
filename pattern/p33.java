package pattern;
/*WAP TO PRINT
*
**
***
****
*****
*/

public class p33 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <=coloumn; j++) {
				if(i>=j) {
					System.out.print('*');}
			}
			System.out.println();
	}
}	
}