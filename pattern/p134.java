package pattern;
/*Write a program to print this pattern
*****
** **
* * *
** **
*****
we print the stars for first row(row=0),first column(col=0),last row(row-1), last column(col-1)for diagonal 
we have to pass i+j==row and for another diagonal i==j
else we print spaces
 */
public class p134 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		
		for(int i = 0;i< row;i++) {
			for(int j = 0;j< col;j++) {
				if(i==0||i==row-1||j==0||j==col-1 ||i==j||i+j==row-1) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}	
			}
			System.out.println();
		}
		
	}
	

}