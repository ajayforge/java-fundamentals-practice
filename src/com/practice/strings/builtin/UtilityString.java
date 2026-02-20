package com.practice.strings.builtin;

public class UtilityString {
	public static void main(String[] args) {
		
		System.out.println("  String length 0 \u2193 ");
		String s = "";
		System.out.println("  "+s.isEmpty());
		
		System.out.println("\n  String is empty or contains only space \u2193 ");
		String a = "  ";
		System.out.println("  "+a.isBlank());
		
		System.out.println("\n  Coverts other data types to String");
		int b = 10 ;
		String c = String.valueOf(b);
		System.out.println("  "+c);
		
		
	}

}
