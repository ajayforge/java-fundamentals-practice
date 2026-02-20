package com.practice.basics;

import java.util.*;

public class ScannerUserInput {
	public static void main(String[] arg) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter The Input : ");
		int a = S.nextInt();
		System.out.println("Enter The Input : ");
		short b = S.nextShort();
		System.out.println("Enter The Input : ");
		byte c = S.nextByte();
		System.out.println("Enter The Input : ");
		long d = S.nextLong();
		System.out.println("Enter The Input : ");
		double e = S.nextDouble();
		char f = S.next().charAt(0);
		boolean g = S.nextBoolean();
		// String h = S.NextString()

		System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g);
		S.close();

	}

}
