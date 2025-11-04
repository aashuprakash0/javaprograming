package pattern;
/*Write a program to print this pattern
*********
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*********
we print the stars for for middle row j==row/2 and for middle col j==col/2 and for diagonal i==j and i+j==row-1
 */
public class p138 {
	public static void main(String[] args) {
		int row=9; 
		int no_char=row;
		int no_space=0;
		
		
		for(int i = 0;i< row;i++) {
			for(int j = 0;j< no_space;j++) {
				System.out.print(' ');
				}
				for (int k = 0; k < no_char; k++) {
				if(i==0||k==0||i==row-1||k==no_char-1) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
				}
			
			System.out.println();
			if(i<(row-1)/2) {
				no_char-=2;
				no_space++;}
			else {
				no_space--;
				no_char+=2;
			} 
				
			
		}
		
	}
	

}