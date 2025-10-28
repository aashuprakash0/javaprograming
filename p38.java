package pattern;
/*WAP TO PRINT
54321
 5432
  543
   54
    5
*/

public class p38 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 1; i <=row; i++) {
			int num=5;
			for (int j = 1; j <=coloumn; j++) {
				if(j<i) {
					System.out.print(" ");}
				else 
				{
					System.out.print(num--);
				}
			}
			System.out.println();
	}
}	
}