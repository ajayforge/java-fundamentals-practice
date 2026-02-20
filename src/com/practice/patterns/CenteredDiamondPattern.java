package com.practice.patterns;

public class CenteredDiamondPattern {
	public static void main(String[] args) {
		
		int a = 5;
		 
		for(int i=1;i<=a;i++)              // --> Row
		{
			for(int j=i;j<=a;j++) 
			{
				System.out.print(" ");    // --> space
			}
			for(int k=1;k<=i;k++)  
			{
				System.out.print("* ");	  // --> star  
			}
			System.out.println();         // --> next line
		}
		 
		// a = 4   
		for(int i=a-1;i>=1;i--)           // --> Row
		{
			for(int j=a;j>=i;j--) 
			{
				System.out.print(" ");    // --> space
			}
			for(int k=1;k<=i;k++)  
			{
				System.out.print("* ");    // --> star
			}
			System.out.println();          // --> next line
		}
		
		
		
	 // 10 line for this code	
		
		/*for(int i=1;i<=a;i++)  // Row
		{
			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=a;k++)
			{
				System.out.print(" *");
			}
			
		
			System.out.println();
		}*/
		
		
	}

}
