package numbers;

import java.util.Scanner;

//Write a program to check a whether a number is a perfect number
public class p27 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt(); 
	int sum=0; 
	for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }
	if(sum==num) 
		System.out.println(num+" is a Perfect No");
	else
		System.out.println(num+" is not a Perfect No");
	
}
}
