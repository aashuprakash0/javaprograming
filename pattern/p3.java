package pattern;
/* WAP to print
EDCBA
EDCBA
EDCBA
EDCBA
EDCBA
 */
public class p3 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 0; i < row; i++) {
			char ch='E';
			for (int j = 0; j < coloumn; j++) {
				System.out.print(ch--);
			}
			System.out.println();
		}
	}

}
