package com.practice.strings.builtin;

public class IndexString {
	public static void main(String[] args) {
		
		System.out.println("Return Index First Occurance \u2193 ");
		String a = "Programming ";
		System.out.println("Char Index \u2192 "+a.indexOf('r'));
		System.out.println("String Index \u2192 "+a.indexOf("gram"));
		
		System.out.println("\nReturn Index Last Occurance \u2193 ");
		String b = "Programming programming ";
		System.out.println("Char Index \u2192 "+b.lastIndexOf('r'));
		System.out.println("String Index \u2192 "+b.lastIndexOf("gram"));
	}

}

