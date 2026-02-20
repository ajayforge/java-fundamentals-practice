package com.practice.strings.builtin;

public class AccessingStringData {
	public static void main(String[] args) {

		System.out.println("\nLength() Space also\u2193");
		String a = " Ajith Kumar";
		System.out.println(a.length());

		System.out.println("\nCharacter At (0) given Index \u2193");
		System.out.println(a.charAt(4));

		System.out.println("\n Joins Two Strings concat() together \u2193");
		String b = "   Hello";
		System.out.println(b.concat("  World"));
	}
}