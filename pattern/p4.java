package pattern;
/*WAP TO PRINT
 12345
12345
12345
12345
12345
 */

public class p4 {
	public static void main(String[] args) {
		int row=5; 
		int coloumn=5;
		for (int i = 0; i < row; i++) {
			int num= 1; 
			for (int j = 0; j <coloumn; j++) {
				System.out.print(num++);
			}
			System.out.println();
		}
	}
	
	

}
