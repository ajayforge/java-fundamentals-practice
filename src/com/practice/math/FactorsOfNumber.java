package com.practice.math;

public class FactorsOfNumber {
	public static void main(String[] args) {
		int a = 10;

		int i;
		for (int j = 1; j <= a; j++) {
			int count = 0;
			System.out.print("Number : "+j+ " | Factors : ");
			for (i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
					System.out.print(i+" ");

				}

			}
			System.out.println("| Count = "+count);

		}

	}

}
