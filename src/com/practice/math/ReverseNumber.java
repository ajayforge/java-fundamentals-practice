package com.practice.math;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		//int temp = a;
		int sum = 0;

		while (a > 0) {
			int rem = a % 10;
			sum =sum*10 + rem;
			a /= 10;
		}
		System.out.println(sum);
		sc.close();
	}

}
