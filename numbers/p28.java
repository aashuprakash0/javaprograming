package numbers;

import java.util.Scanner;

// Write a program to check whether a number is a Spy Number
public class p28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int product = 1;

        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;        // add digits
            product *= lastDigit;    // multiply digits
            temp /= 10;
        }

        if (sum == product)
            System.out.println(num + " is a Spy Number");
        else
            System.out.println(num + " is not a Spy Number");
    }
}
