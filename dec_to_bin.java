package com.dsa.Pattern;

public class dec_to_bin {
public static void Dec(int n) {
	int m=n;
	int pow=0;
	int num=0;
	while(n>0) {
		int rem=n%2;
		num=num+(rem*(int)Math.pow(10, pow));
		pow++;
		n=n/2;
		
	}
	System.out.println("Binary form of "+m+"= "+num);
}
public static void main(String args[]) {
	Dec(15);
}
}
