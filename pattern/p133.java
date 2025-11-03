package pattern;
/*
Pattern-137

    *
   * *
  *   *
 *     *
*********

Pyramid problems
consider 2 variables number of characters and number of spaces to printed in every row
we use 3 loops
1 for row(outer loop) 
1 for number of spaces and 1 for number of characters(2 inner loops one after the other)
number of spaces will always be = row -1 for the 1st row 
number of characters for the first row = 1

For the above pattern no of rows = 5
no_char       no_spaces
 1                4
 3                3
 5                2
 7                1
 9                0
 as we can see here at every row number of characters of increasing by 2(no_char += 2)
 and the number of spaces are decreasing by 1(no_spaces--)
 */
public class p133 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 1;
		int no_spaces = row -1;
		for(int i = 0;i< row;i++) { // for the rows
			for(int j = 0;j< no_spaces;j++) {// for the number of spaces
					System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) { // for number of characters
				if(k==0 || k==no_char-1||i==row-1) {// important
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
				
			}
			System.out.println();
			no_char += 2;//important
			no_spaces--;//important
		}
	}

}
