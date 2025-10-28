package pattern;
/*WAP TO PRINT
1
21
321
4321
54321
*/

public class p28 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 0; i < row; i++) {
			int num= 1 ;
			num=(num+i)%2;
		for (int j = 0; j < coloumn; j++) {
				if(i>=j) {
					System.out.print(num++);
				}else {
					System.out.print("");}
			}
			System.out.println();
	}
}	
}