package com.practice.patterns;

public class InvertedRightTriangle {
	public static void main(String[] args) {
		
		int a = 5;
		
		for(int i=1;a>=i;i++)    //-- row
		{
			for(int j=a;j>=i;j--)  		//star
			{
				System.out.print("* ");
			}
			
			// space
			
			
			//for(int k=1;k<=i;k++)
			//{							
			//	System.out.print(" ");
			//}
			System.out.println();
		}
	}
}
