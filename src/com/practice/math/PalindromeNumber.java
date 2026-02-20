package com.practice.math;

import java.util.Scanner;

/// Reverse also using this same 
public class PalindromeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;

		while (temp > 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		// System.out.println(sum);

		if (num == sum) {
			System.out.println("Palindrom num : " + sum);

		} else {
			System.out.println("Not Palindrome : " + sum);
		}
		sc.close();

	}
}
