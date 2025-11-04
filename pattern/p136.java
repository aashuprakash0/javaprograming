package pattern;
/*Write a program to print this pattern
* * *
 *** 
*****
 *** 
* * *
we print the stars for for middle row j==row/2 and for middle col j==col/2 and
for diagonal i==j and i+j==row-1
else we print spaces
 */
public class p136 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		
		for(int i = 0;i< row;i++) {
			for(int j = 0;j< col;j++) {
				if(i==row/2||j==col/2||i==j||i+j==row-1) {
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