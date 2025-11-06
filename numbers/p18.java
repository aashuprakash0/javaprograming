package numbers;
//Write a program to print first 10 number in fibonocci series
public class p18 {
public static void main(String[] args) {
	int x1=0;
	int x2=1;
	int nextno;
	int count=10;
	System.out.print(x1+","+x2);
	while(count-2>0) {
		nextno=x1+x2; 
		System.out.print(","+nextno);
		x1=x2;
		x2=nextno;
		count--;
	}	
}
}
