package numbers;
/*
WAP to swap to numbers without using additional and temporary variable  
  
 */
public class p2 {
	public static void main(String[] args) {
		int a=100;
		int b=200; 
		System.out.println("a="+a+",b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+",b="+b);
	}
}
