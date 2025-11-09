package numbers;
import java.util.Scanner;
//Wap to print cube root of a number
public class p25 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num");
	float num=sc.nextFloat(); 
	float cbrt=num/3; 
	float temp=0; 
	while(cbrt-temp!=0) {
		temp=cbrt; 
		cbrt=(2*temp+num/(temp*temp))/3; 
	}
	System.out.println(cbrt);
}
}
