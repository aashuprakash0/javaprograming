package pattern;
/*WAP TO PRINT
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
*/
public class p6 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5; 
		char ch='A';
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < coloumn; j++) {
			System.out.print(ch);
		}
		System.out.println(); //System.out.println(ch++);
		ch++;
	}
	}

}
