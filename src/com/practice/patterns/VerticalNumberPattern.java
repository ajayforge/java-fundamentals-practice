package com.practice.patterns;

public class VerticalNumberPattern {
	public static void main(String[] args) {
		
		int a = 5;
		 
		for(int i=1;i<=a;i++)
		{
			int b =i;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(b+" ");
				b += a-j;
				
			}
			System.out.println();
		}
	}

}
