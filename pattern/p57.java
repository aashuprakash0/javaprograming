package pattern;
/*WAP TO PRINT
    1
   12
  123
 1234
12345
*/

public class p57 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 0; i <row; i++) {
			int num = 1;
			for (int j = 0; j <coloumn; j++) {
				
				if((i+j)>=row-1) {
					System.out.print(num);
					num++;
					}
				else 
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
			num++;
	}
}	
}