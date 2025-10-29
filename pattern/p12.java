package pattern;
/*WAP TO PRINT
10101
01010
10101
01010
10101
*/

public class p12 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5; 
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < coloumn; j++) {
			System.out.print((i+j+1)%2);
		}
		System.out.println(); 
		
	}
	}
	}


