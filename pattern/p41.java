package pattern;
/*WAP TO PRINT
11111
 2222
  333
   44
    5
*/

public class p41 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		int num=1;
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <coloumn; j++) {
				if(j<i) {
					System.out.print(" ");}
				else 
				{
					System.out.print(num);
				}
			}
			System.out.println();
			num++;
	}
}	
}