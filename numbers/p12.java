package numbers;

import java.util.Scanner;

//WAP to check whether number is pallindrome
public class p12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(); 
		int temp=num;
		int lastDigit;
		int reverse=0; 
		while(temp!=0) {
			lastDigit=temp%10 ;
			temp/=10;
			reverse=reverse*10+lastDigit ;	
		}
		if (num==reverse) {
			System.out.println(num+" is a palindrome ");
		}
		else {
			System.out.println(num+" is not a palindrome ");
		}
		
	}
}
