package com.practice.arrays;
import  java.util.*;
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b[] = new int[a];	
		int sum =0;
		for(int i=0;i<a;i++)
		{
			 b[i] = sc.nextInt();
			sum +=b[i];
		}
		System.out.print(sum);
		sc.close();
	}

}
