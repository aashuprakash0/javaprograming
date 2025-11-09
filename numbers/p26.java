package numbers;

import java.util.Scanner;

//Write a Program to check whether a  number is strong no or peterson no or krisnamurthy no 
public class p26 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int temp=num;
	int sum=0; 
	
	while(temp!=0) {
		int lastdigit = temp % 10 ;
		int factorial=1;
		for (int i = lastdigit;i>=1; i--) {
		factorial*=i; 	
		}
	sum+=factorial; 
	temp/=10; 
	}
	if(sum==num) 
		System.out.println(+num+" is a Strong No");
	else
		System.out.println(+num+" is not a Strong No");
}
}
