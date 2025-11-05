package numbers;

import java.util.Scanner;

/*Write A Program to find the product of all the digits in a number
 * 
 * 
 * */
public class p10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	int num=sc.nextInt();
	int product=1;
	int lastDigit; 
	while(num!=0) {
		lastDigit=num%10;
		num/=10;
		product*=lastDigit;
	
		
	}
	System.out.println("Product of digits="+product);
}
}
