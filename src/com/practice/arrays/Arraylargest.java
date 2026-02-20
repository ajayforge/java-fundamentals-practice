package com.practice.arrays;

public class Arraylargest {
	public static void main(String[] args) {

		int[][] a = { { 5, 8, 4 }, { 9, 3, 5 } };
		
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
		
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
					
			}
			System.out.println(max);
		}
	}

}
