package com.practice.math;

import java.util.*;

public class FactorialCalculation {
	// factorial and stong number find
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		int sum = 0;

		while (temp > 0) {
			int rem = temp % 10;
			int fact = 1;

			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum += fact;
			// System.out.println(sum);
			temp = temp / 10;
		}
		System.out.println(sum);

		if (a == sum) {
			System.out.println("Strong Number");
		} else {
			System.out.println("no Strong Number");
		}
		sc.close();

	}

}
