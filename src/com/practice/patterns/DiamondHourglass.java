package com.practice.patterns;

public class DiamondHourglass {
		public static void main(String[] args) {
			
			
			int a = 5;
			
			for(int i=a;i>=1;i--)
			{
				for(int j=a;j>i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=2*i-1;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			
				for(int i=2;i<=a;i++)
			{
				for(int j=a;j>i;j--)
				{
				System.out.print(" ");
				}
				for(int k=1;k<=2*i-1;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
				
			
		
			
		}
}
