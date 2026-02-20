package com.practice.basics;

public class ForLoopDemo {
	public static void main(String[] arg)
	{
		for(int i=5;i>=1;i--)
		{
			System.out.println("AJ: "+i);
			
			//Nested for loop also included
			
			for(int j=1;j<=2;j++)
			{
				System.out.println("AY : "+j);
			}
		}
		
	}
	

}
