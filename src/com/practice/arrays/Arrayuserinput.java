package com.practice.arrays;

import java.util.*;

public class Arrayuserinput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		int i;
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		int j;
		int sum = 0;
		for (j = 0; j < n; j++) {
			System.out.print(a[j] + " ");
			sum += a[j];
		}
		System.out.println();
		System.out.println(sum);
		sc.close();
	}

}
