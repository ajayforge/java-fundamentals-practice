package com.practice.arrays;

import java.util.*;

public class TwoDarraysum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] a = new int[r][c];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j < r; j++) {

				sum += a[j][i];

			}
			System.out.println(sum);
			sc.close();
		}

	}

}
