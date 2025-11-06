package numbers;
import java.util.Scanner;

/*Write a Program  to calculate 
 * factorial of number using method recursion 
*/
public class p17 {
	public static int factorial(int num) {
	    if (num == 0 )
	        return 1;
	    else
	        return num * factorial(num - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Factorial of " + num + " = " + factorial(num));

		
	}

}