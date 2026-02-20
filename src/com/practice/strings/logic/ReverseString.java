package com.practice.strings.logic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String Name = sc.nextLine();

		String rev = "";
		for (int i = Name.length() - 1; i >= 0; i--) {
			rev = rev + Name.charAt(i);
		}

		System.out.println(rev);

		sc.close();

	}
}
