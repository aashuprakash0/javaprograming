package pattern;
/*WAP TO PRINT
*****
 ****
  ***
   **
    *
*/

public class p34 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=coloumn; j++) {
				if(j<i) {
					System.out.print(" ");}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
	}
}	
}