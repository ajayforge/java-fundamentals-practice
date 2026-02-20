package com.practice.strings.logic;

import java.util.Scanner;

public class StringContains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		boolean D = false;
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (c >= '0' && c <= '9') {
				D = true;
				break;
			}
		}
		if (D) {
			System.out.println("String Contains Digits");
		} else {
			System.out.println("String Does Not Contains Digits");
		}
		sc.close();
	}

}
