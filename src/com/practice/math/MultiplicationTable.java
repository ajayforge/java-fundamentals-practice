package com.practice.math;
 import java.util.*;
public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1;i<=b;i++)
			{
			System.out.println(i+" x "+a+" = "+i*a);
		}
		sc.close();
	}

}
