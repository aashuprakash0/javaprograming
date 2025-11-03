package pattern;
/*
Pattern-136

*****
*   *
*   *
*   *
*****

we print the stars for first row(row=0),first column(col=0),last row(row-1), last column(col-1)
else we print spaces
 */
public class p132 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		
		for(int i = 0;i< row;i++) {
			for(int j = 0;j< col;j++) {
				if(i==0||i==row-1||j==0||j==col-1) {
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