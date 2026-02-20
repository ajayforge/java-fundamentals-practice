package com.practice.arrays;

import java.util.*;

public class ArrayReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int b[] = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();

		}

		int i = 0;
		int j = b.length - 1;
		while (j > i) {
			int temp = b[i];
			b[i] = b[j];
			b[j] = temp;
			i++;
			j--;
		}
		for (int k = 0; k < b.length; k++) {
			System.out.println(b[k]);
		}
		sc.close();
	}

}
