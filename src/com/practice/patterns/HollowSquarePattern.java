package com.practice.patterns;

public class HollowSquarePattern {
		public static void main(String[] args) {
			
			
			int a = 5;
			
			for(int i=1;i<=a;i++)
			{
				for(int j=1;j<=a;j++)
				{
					if((i==1)||(j==1)||(i==a)||(j==a))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			
		}
}
