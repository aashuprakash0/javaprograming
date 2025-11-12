package Array;

import java.util.Arrays;

//Write a program for sorting the Array in decreasing order using 
//BubbleSort technique
public class p6 {
public static void main(String[] args) {
	int [] x= {40,30,10,50,20};
	System.out.println(Arrays.toString(x));
	BubbleSort(x);
	System.out.println(Arrays.toString(x));
	
}

public static void BubbleSort(int[]a) {
	for (int i = 0; i < a.length-1; i++) {
		for (int j = 0; j < a.length-1-i; j++) {
			if (a[j] < a[j+1]) {
				int temp =  a[j]; 
				a[j]     =  a[j+1];
				a[j+1]   =  temp; 
			}
		}
	}
}
}
