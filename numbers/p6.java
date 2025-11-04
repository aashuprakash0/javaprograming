package numbers;
//WAP to find a sum of event numbers without from 1 t0 100 without using any loop 

public class p6 {
static int num=2;
static int even_sum=0;
public static void main(String[] args) {
	if(num<=100) {
		even_sum+=num;//even_sum=even_sum+num 
		num+=2; //num=num+2
		
		main(null);	
	}else {
	System.out.println("Even sum="+even_sum);
	}	
}
}

