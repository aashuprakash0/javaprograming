package numbers;
//WAP to find a sum of natural number from 1 to 100 without using any loop

public class p7 {
static int num=0;
static int natural_sum=0;
public static void main(String[] args) {
	if(num<=100) {
		natural_sum+=num; 
		num++;
		
		main(null);	
	}else {
	System.out.println("Even sum="+natural_sum);
	}	
}
}


