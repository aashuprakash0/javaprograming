package pattern;
/*WAP TO PRINT
5
54
543
5432
54321
*/

public class p19 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
	for (int i = 0; i < row; i++) {
		int num=5;
		for (int j = 0; j < coloumn; j++) {
			if(i>=j) {
				System.out.print(num--);
			}else {
				System.out.print("");
			}
		}
		System.out.println(); 
}
}	
}