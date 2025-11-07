package numbers;

import java.util.Scanner;

// Write a program to check whether a number is Neon Number
public class p23 {

  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum=0;
        int sqr=num*num;
        while (sqr != 0) {
            sum += sqr % 10;
            sqr /= 10;
        }
        if (num==sum) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is NOT a Neon Number.");
        }
    }
}
