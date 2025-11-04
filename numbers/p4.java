package numbers;
//Write a program to print even numbers from 1 to 100 without using any loop
public class p4 {
	static int num=1;
public static void main(String[] args) {
	
	if(num%2==0) {
		System.out.println(num++);
	}else 
		num++;
	if (num<=100) {
		main(null);
	}
	
}
}
/*
 * public class p4 {
 * static int num=2;
 * public static void main(String[]args){
 * if(num<=100){
 * System.out.println(num);
 * num+=2;
 * main(null)
 * 
 * }
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * */
 