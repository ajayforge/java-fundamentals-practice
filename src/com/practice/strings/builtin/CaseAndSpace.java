package com.practice.strings.builtin;

public class CaseAndSpace {
	public static void main(String[] args) {

		String a = "Singam";
		System.out.println("\n   String UpperCase() \u2193 ");
		System.out.println("   "+a.toUpperCase());

		System.out.println("\n   String LowerCase() \u2193 ");
		System.out.println("   "+a.toLowerCase());

		System.out.println("\n   String trim()  Remove the Space");
		String b = "        AJAY";
		System.out.println("   "+b.trim());
	}

}
