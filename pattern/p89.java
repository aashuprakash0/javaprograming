package pattern;
/* WAP TO PRINT
    1
   123
  12345
 1234567
123456789
*/

public class p89 {
	public static void main(String[] args) {
        int row = 5;
        int no_char = 1;
        int no_space =row-1;
        for (int i = 0; i < row; i++) { 
        	int num=1;
            for (int j = 0; j < no_space; j++) {
                    System.out.print(' '); 
            }
            for (int k = 0; k < no_char; k++) {
				System.out.print(num);
				 num++;
			}
            System.out.println();
            no_char+=2;
            no_space--;
        }
    }
}
