package numbers;
import java.util.Scanner;
//Write a Program to find a square root of a number
public class p24 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	float num=sc.nextFloat();
	float sqrt=num/2; 
	float temp=0;
	while(sqrt-temp!=0) {
		temp=sqrt; 
		sqrt=(temp+num/temp)/2;
	}
	System.out.println("Square root of "+num+" is "+sqrt);
}
}
