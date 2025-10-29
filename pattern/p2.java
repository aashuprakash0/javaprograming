package pattern;
/* Write a program to print
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 */
public class p2 {
public static void main(String[] args) {
	int row=5;
	int coloumn=5; 
	for (int i = 0; i < row; i++) {
		char ch='A';
		for (int j = 0; j < coloumn; j++) {
		System.out.print(ch++); /*ch++ is an post-increment operator*/
		}
		System.out.println();
	}
	
}
}
