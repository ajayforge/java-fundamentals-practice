package com.practice.patterns;

import java.util.Scanner;

public class PalindromicNumberPyramid {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int k=i;k<=a;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=2*i-1;j++)
			{
				System.out.print(j);
			}
			for(int m=i*2-2;m>=i;m--)
			{
				System.out.print(m);
			}
		
			System.out.println();
		}
		sc.close();
	}

}
