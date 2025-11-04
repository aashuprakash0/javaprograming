package pattern;
/*Write a program to print this pattern
*****
* * *
*****  //for this row/2
* * *
*****
  for this col/2
we print the stars for first row(row=0),first column(col=0),last row(row-1), for third middle roe wh have to pass i==row/2
and for third col we have to pass j==col/2
else we print spaces
 */
public class p135 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		
		for(int i = 0;i< row;i++) {
			for(int j = 0;j< col;j++) {
				if(i==0||i==row-1||j==0||j==col-1 ||i==row/2||j==col/2) {
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