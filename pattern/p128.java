package pattern;
/*
Write a program to print this pattern
*      *
**    **
***  ***
********
***  ***
**    **
*      *
Butterfly pattern problems
consider 2 variables number of characters and number of spaces to be printed in every row
we use 4 loops
1 for row(outer loop),
1 for number of spaces,
1 for number of characters of left half of pattern and
1 for number of characters of right half of pattern(3 inner loops one after the other)
no_spaces will be row -1
number of characters for the first row = 2

For the above pattern no of rows = 7
we here use 2 for loops to print character and 1 for spaces
1st inner for loops will iterate in the left half with condition less than no_char/2
2nd inner loop for spaces 
3rd inner for loops will iterate in the right half with condition less than no_char/2
no_char       no_spaces
 6                2           left part triangle
 4                4           i < row/2 (lesser)                              
 2                6           no_spaces-= 2 (no_spaces decrementing by 2)
 0                8           no_char += 2 (no_char incrementing by 2)
 ----------------------------------                
 2                6       right part triangle
 4                4       i > row/2(lesser)
 6                2       no_char += 2  (no_char incrementing by 2)
                          no_spaces -= 2 (no_spaces decrementing by 2)
-----------------------------------------------------------------                          
First we divide the pattern into 2 triangles left part and right part
left and right part logic should be written after the System.out.println();
inside the outer for loop

 */
public class p128 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 2;
		int no_spaces = row - 1;
		for(int i = 0;i< row;i++) { // for the rows
			for(int j = 0;j< no_char/2;j++) {// for the number of character 
					System.out.print('*');//for the left half pattern
			}
			for (int k = 0; k < no_spaces; k++) { // for number of characters
				System.out.print(' ');
			}
			for(int l = 0;l< no_char/2;l++) {// for the number of character 
				System.out.print('*');//for the right half pattern
		}
			System.out.println();
			if(i<row/2) {
				no_char+=2;
				no_spaces-=2;
			}
			else {
				no_char-=2;
				no_spaces+=2;
			}
		}
	}
}