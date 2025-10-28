package pattern;
/*WAP TO PRINT
55555
44444
33333
22222
11111
*/

public class p9 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5; 
		int num= 5;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < coloumn; j++) {
			System.out.print(num);
		}
		System.out.println(); 
		num--;
	}
	}
}
