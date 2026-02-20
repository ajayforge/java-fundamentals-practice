package com.practice.strings.logic;

import java.util.*;

public class ToggleCaseToEachchar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				result += Character.toUpperCase(c);
			} else {
				result += c;
			}
		}
		System.out.println(result);
		sc.close();
	}
}