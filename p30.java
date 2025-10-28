package pattern;
/*WAP TO PRINT
1
01
101
0101
10101
*/

public class p30 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 0; i < row; i++) {
			int num=1;
			for (int j = 0; j <=coloumn; j++) {
				if(i>=j) {
				if((i+j)%2==0) {
					System.out.print("1");
				}else {
					System.out.print("0");}
			}}
			System.out.println();
	}
}	
}