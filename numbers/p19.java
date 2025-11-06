package numbers;
//Write a program to print first 10 number in fibonocci series using method recursion
public class p19 {
	static int x1=0;
	static int x2=1;
	static int nextno;
	
	public static void  printFibonacci(int count ) {
		nextno=x1+x2;
		System.out.print(","+nextno);
		x1=x2;
		x2=nextno;
		count--;
		if (count>0) {
			printFibonacci(count);
		}
	}
	
	
	
public static void main(String[] args) {
	int count=10;
	System.out.print(x1+","+x2);
	printFibonacci(count-2);
}
}
//0,1,1,2,3,5,8,13,21,34