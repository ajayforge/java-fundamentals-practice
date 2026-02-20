package com.practice.basics;

import java.util.Scanner;

public class EscapeSequence {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int b = s.nextInt();
		System.out.print("My Name :" + a + "\n" + "ReG no : " + b);
		s.close();

	}
}
