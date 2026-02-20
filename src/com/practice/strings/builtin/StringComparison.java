package com.practice.strings.builtin;

public class StringComparison {
	public static void main(String[] args) {

		System.out.println(" Compare Two Strings equals() \u2193");
		String a = "JAVA ";
		String b = "World";
		String c = "JAVA ";
		String d = "Java ";
		System.out.println("  "+a.equals(c));
		System.out.println("  "+a.equals(b));
		
		System.out.println("\n Compare Two Strings ignorecase() \u2193");
		System.out.println("  "+a.equalsIgnoreCase(d));
		
		System.out.println("\n Compare Two Strings Dictionary order \u2193 \n ");
		String a1 = "Apple";
		String a2 = "Apple";
		String a3 = "Banana";
		System.out.println("  Equals "+a1.compareTo(a2));
		System.out.println("   -  <  "+a1.compareTo(a3));
		System.out.println("   +  >   "+a3.compareTo(a1));
		
	}

}
