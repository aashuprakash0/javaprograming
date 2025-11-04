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
public class p139 {
	public static void main(String[] args) {
		int row=7; 
		int no_char=1;
		int no_space=row/2;
		
		
		for(int i = 0;i< row;i++) {
			for(int j = 0;j< no_space;j++) {
				System.out.print(' ');
				}
				for (int k = 0; k < no_char; k++) {
				if(k==0||k==no_char-1) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
				}
			
			System.out.println();
			if(i>=(row-1)/2) {
				no_char-=2;
				no_space++;}
			else {
				no_space--;
				no_char+=2;
			} 
				
			
		}	
	}
}



//00 01 02 03 04
//10 11 12 13 14 
//20 21 22 23 24 
//30 31 32 33 34
//40 41 42 43 44
