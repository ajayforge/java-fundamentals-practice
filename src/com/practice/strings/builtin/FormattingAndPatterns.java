package com.practice.strings.builtin;

public class FormattingAndPatterns {
	public static void main(String[] args) {
		
		
		System.out.println(" Used to format a String Using Placeholder \u2193 ");
		
		String s =String.format("\n     Hello %s \u2192 Your score id \u2192 %d ","Ajith",95);
		System.out.println(s);
		
		
		System.out.println("\n String Matches given Regex Pattern \u2193 ");
		
		String a = "abc123";
		System.out.println("\n         "+a.matches("[a-z0-9]+"));
	}

}
