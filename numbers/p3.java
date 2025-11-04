package numbers;
//WAP to print numbers from 1 to 100 without using any loop  
public class p3 {
	static int a=1;
	public static void main(String[] args) { 
		System.out.println(a++);
		if(a<=100) {
			main(null);
		}
	}
}
