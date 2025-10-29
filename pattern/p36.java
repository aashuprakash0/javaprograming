package pattern;
/*WAP TO PRINT
EDCBA
 EDCB
  EDC
   ED
    E
*/

public class p36 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		for (int i = 1; i <=row; i++) {
			char ch='E';
			for (int j = 1; j <=coloumn; j++) {
				if(j<i) {
					System.out.print(" ");}
				else 
				{
					System.out.print(ch--);
				}
			}
			System.out.println();
	}
}	
}