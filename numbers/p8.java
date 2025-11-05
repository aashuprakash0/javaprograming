package numbers;

import java.util.Scanner;

//WAP to count the number of digits in a number
public class p8 {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number");
	   int num=sc.nextInt();
	   int digits=0 ; 
	   while(num!=0) {
		   num/=10; /*num=num/10*/
		   digits++;
	   }
	   System.out.println("Digits="+digits);
	}
	
	
	
	
	
	
	
	
	
}

/*	
public static void main(String[] args) {
	int num=4587836 ; 
	int digit=0;
	while(num!=0) {
		num/=10; // num=num/10
		digit++;
	}
	System.out.println(digit);
}
}*/
