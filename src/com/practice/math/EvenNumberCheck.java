package com.practice.math;

public class EvenNumberCheck {
	public static void main(String[] args) {

		int a = 10;

		for (int i = 1; i <= a; i++) {
			if (i == 4) {
				continue;
			} if (i % 2 == 0)

			{
				System.out.println("Even Num : " + i);
			}
		}

	}
}
