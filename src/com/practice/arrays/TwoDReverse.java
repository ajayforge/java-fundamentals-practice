package com.practice.arrays;

import java.util.*;

public class TwoDReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int row = 2;
		///int col = 3;
		int[][] a = { { 1, 2, 3 }, { 22, 45, 67 } };

		for (int i = a.length -1; i >=0; i--) {
			for (int j = a[i].length - 1; j >=0; j--) {

				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
			sc.close();
		}
	}

}
