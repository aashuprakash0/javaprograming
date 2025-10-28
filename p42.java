package pattern;
/*WAP TO PRINT
55555
 4444
  333
   22
    1
*/

public class p42 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		int num=5;
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
			num--;
	}
}	
}