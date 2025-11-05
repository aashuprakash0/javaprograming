package numbers;

import java.util.Scanner;

/*
 Write  a program to find the sum of all the digits in  number 
 */
public class p9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(); 
		int sum=0 ;
		int lastDigit; 
		while (num!=0) {
			lastDigit=num%10;  //(%) this is give you the remainder
			sum+=lastDigit;   //Sum=sum+lastDigit
			num/=10;		  //num=num/10  (125/10=12)It gives Quotient
		}
		System.out.println("Sum of Digit ="+sum);
	}

}
