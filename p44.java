package pattern;
/*WAP TO PRINT
ABCDE
 ABCD
  ABC
   AB
    A
*/

public class p44 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		
		for (int i = 0; i <row; i++) {
			char ch='A';
			for (int j = 0; j <coloumn; j++) {
				
				if(j<i) {
					System.out.print(" ");}
				else 
				{
					System.out.print(ch);
					ch++;
				}
			}
			System.out.println();
			ch++;
	}
}	
}