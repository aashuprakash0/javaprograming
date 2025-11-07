package numbers;

import java.util.Scanner;

//Write  a program to check whether a number is automorphic number 
public class p20 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num =sc.nextInt(); 
	int temp=num;
	int sqr=num*num;
	boolean flag=true;
	while(temp!=0)
	{
		if (sqr%10!=temp%10) {
			flag = false; 
			break;	
		}
		temp/=10;//temp=temp/10
		sqr/=10;//sqr=sqr/10
	}
	if (flag) {
		System.out.println(num+"is a automorphic number");
	} else {
		System.out.println(num+"is a not automorphic number");
	}	
  }
}
