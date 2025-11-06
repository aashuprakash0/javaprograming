package numbers;

import java.util.Scanner;

//WAP to check whether a number is prime number using method recursion
public class p15 {	
	static int divisor =2;
	static boolean flag=true; 
	public static boolean isPrime(int num) 
	{
	if(divisor<=num/2) {
		if(divisor<=num/2) {
			flag=false;
		}
	}	else {
		divisor++;
		isPrime(num); 
	}
	return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
}
	}
