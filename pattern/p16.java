package pattern;
/*WAP TO PRINT
A
AB
ABC
ABCD
ABCDE
*/

public class p16 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
	for (int i = 0; i < row; i++) {
		char ch='A';
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