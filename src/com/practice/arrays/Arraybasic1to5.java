package com.practice.arrays;

import java.util.*;
import java.util.Arrays;

public class Arraybasic1to5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Array Size : ");
		int n = sc.nextInt();

		int[] a = new int[n];
		System.out.println("1.Sum of Array Elements");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println("  Total Sum : " + sum + "\n" + "  ");

		System.out.println("2.Max value in Array");
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println("  Max value is : " + max + "\n" + "  ");

		System.out.println("3.Reverse Array");
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print("  " + a[k] + " ");
		}
		System.out.println("\n" + "   ");

		System.out.println("4.Search Element ");
		int key = sc.nextInt();
		boolean Found = false;
		for (int m = 0; m < a.length; m++) {
			if (a[m] == key) {
				Found = true;
				break;
			}
		}
		if (Found) {
			System.out.println("Found Element is : " + key);
		} else {
			System.out.println(" Element Not found  ");
		}
		System.out.println("   ");
		System.out.println("5.Sort Array (Acending) :  ");
		Arrays.sort(a);
		System.out.println("  " + Arrays.toString(a));
		
		sc.close();
	}

}
