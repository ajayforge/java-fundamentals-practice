package com.practice.math;

import java.util.*;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int first = 0, second = 1;
		int next = 0;
		for (int i = 2; i <= a; i++) {
			next = first + second;
			System.out.print(next + "  ");
			first = second;
			second = next;
		}
		System.out.println();
		sc.close();
	}

}
