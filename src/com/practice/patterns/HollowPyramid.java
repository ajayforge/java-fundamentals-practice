package com.practice.patterns;

public class HollowPyramid {
	public static void main(String[] args) {
		
		int a = 5;
		
		for(int i=1;i<=a;i++)
		{
			
			for(int j=1;j<=a-i;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=2*i-1;k++)
				{
					if((k==1)||(k==2*i-1)||i==a)
					{
						System.out.print("*");
					}
					
					else
						System.out.print(" ");
				}
					
				System.out.println();
				}
					
			
		}

}

