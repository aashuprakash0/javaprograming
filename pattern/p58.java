package pattern;
/*WAP TO PRINT
    5
   54
  543
 5432
54321
*/

public class p58 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 0; i <row; i++) {
			int num = 5;
			for (int j = 0; j <coloumn; j++) {
				
				if((i+j)>=row-1) {
					System.out.print(num);
					num--;
					}
				else 
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
			num--;
	}
}	
}