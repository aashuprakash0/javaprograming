package pattern;
/*WAP TO PRINT
1
23
456
7891
23456
*/

public class p25 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		int num=1;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < coloumn; j++) {
			if(i>=j) {
				System.out.print(num++);
				if(num==10) {
					num=1;	
			}
			}else {
				System.out.print("");
			}
		}
		System.out.println();
		
}
}	
}