package com.practice.patterns;

public class PyramidPattern {
	
	public static void main(String[] args) {
		
		
	int a = 5;  // row
	int b = 10;
		
		for(int i=1;i<=a;i++)
		{
			for(int j=i;j<b;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) 			//2*i-1 = 2*1-1 = 1 //star
			{									//2*i-1 = 2*2-1 = 3 //star
				System.out.print("* ");
				}
			System.out.println();
		}
	}

}
