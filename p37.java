package pattern;
/*WAP TO PRINT
12345
 1234
  123
   12
    1
*/

public class p37 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 1; i <=row; i++) {
			int num=1;
			for (int j = 1; j <=coloumn; j++) {
				if(j<i) {
					System.out.print(" ");}
				else 
				{
					System.out.print(num++);
				}
			}
			System.out.println();
	}
}	
}