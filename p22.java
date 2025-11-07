package numbers;
import java.util.Scanner;
//Write a java program to check whether a number is a Armstrong Number
public class p22 {
	public static int  noOfDigit(int num) { 
		int digits=0;  
		while(num!=0) {
			digits++;
			num/=10;
		}
		return digits;
	}
	public static boolean isArmStrong(int num) {
		int digit=noOfDigit(num); 
		int sum=0; 
		int temp=num;
		while(temp!=0) {
			int lastDigit=temp%10; 
			int power=1; 
			for (int i = 0; i <digit ; i++) {
				power*=lastDigit;
			}
			sum+=power;
			temp/=10;  //temp=temp/10
		}
		if(num==sum)
			return true;
		else 
			return false;
	}
	

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num =sc.nextInt();
	
	if (isArmStrong(num)) {
        System.out.println(num + " is a Armstrong number.");
    } else {
        System.out.println(num + " is not a Armstrong number.");
    }
}
}
