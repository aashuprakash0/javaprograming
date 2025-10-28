package pattern;
/* WAP  to print this pattern.
 	*****
 	*****
 	*****
 	*****
 	*****
}*/
public class p1 {
	
	public static void main(String[] args) {
		int row= 5; 
		int coloumn=5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
			System.out.print("*");	
			}
			System.out.println();
		}
		
	}
}

