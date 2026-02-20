package com.practice.strings.builtin;

public class StringAndBuffAndBuild {
	public static void main(String[] args) {

		System.out.println("  String in immutable Once Created , You Cannot Modify it \u2193 ");
		String s = "Hello ";
		s.concat("world");
		System.out.println("  " + s);
		s = s.concat("world");
		System.out.println("  " + s);

		System.out.println("\n  StringBuffer is Mutable Slow Theard Safe ,You can change this Content \u2193 ");
		StringBuffer a = new StringBuffer("Hello ");
		a.append("World");
		System.out.println("  " + a);

		System.out.println("\n  StringBuilder is Mutable Fast Theard Not Safe \u2193 ");
		StringBuilder b = new StringBuilder("Hello ");
		b.append("World");
		System.out.println("  " + b);

	}

}
