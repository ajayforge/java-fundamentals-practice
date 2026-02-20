package com.practice.arrays;

public class JaggedArrayDemo {
	public static void main(String[] args) {
		 
		int [][] a = new int[4][];
		
		a[0] = new int [4];
		a[1] = new int [3];
		a[2] = new int [2 ];
		a[3] = new int [3];
		
		System.out.println("\nFor loop\n");
          //for lopp
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]= (int)(Math.random()*10);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("\nEnhanced loop\n");
		//Enhanced loop
		for(int b [] : a)
		{
			for(int  m : b)
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}
