package pattern;
/*WAP TO PRINT
A
BC
DEF
GHIJ
KLMNO
*/

public class p24 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		char ch='A';
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < coloumn; j++) {
			if(i>=j) {
				System.out.print(ch++);
			}else {
				System.out.print("");
			}
		}
		System.out.println();
		
}
}	
}