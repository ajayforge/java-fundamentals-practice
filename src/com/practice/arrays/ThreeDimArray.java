package com.practice.arrays;

public class ThreeDimArray {
	public static void main(String[] args) {
		int[][][] a = new int[2][][];

		a[0] = new int[3][4];
		a[1] = new int[4][6];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {

					a[i][j][k] = (int) (Math.random() * 10);
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
				
			}

			System.out.printf("%n %-2d : Block %n ",i,"%n");
	}
		
	}

}
