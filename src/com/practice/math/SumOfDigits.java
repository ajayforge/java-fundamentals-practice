package com.practice.math;

public class SumOfDigits {
	public static void main(String[] args) {
		
		int a = 2345;
		//int temp = a;
		int sum =0;
		
		while(a>0)
		{
			 int rem = a%10;
			 sum +=rem ; 
			 a = a/10;
		}
		System.out.println(sum);
	}

}
