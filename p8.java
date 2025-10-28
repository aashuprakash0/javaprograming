package pattern;
/*WAP TO PRINT
11111
22222
33333
44444
55555
*/

public class p8 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5; 
		int num= 1;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < coloumn; j++) {
			System.out.print(num);
		}
		System.out.println(); 
		num++;
	}
	}
}
