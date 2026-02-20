package com.practice.arrays;

import java.util.*;

public class SecondLargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] a = { { 9, 9, 7 }, { 10, 4, 7 } };

		int first = 0;
		int second = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] > first) {
					second = first;
					first = a[i][j];
				} else if (a[i][j] > second && a[i][j] < first) {
					second = a[i][j];
				}
			}

		}
		System.out.println(second);
		sc.close();
	}

}
