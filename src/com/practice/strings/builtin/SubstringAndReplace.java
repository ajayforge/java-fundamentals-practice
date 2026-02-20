package com.practice.strings.builtin;

public class SubstringAndReplace {
	public static void main(String[] args) {

		System.out.println("Extract part of String \u2193 ");
		String a = "Programming ";
		System.out.println("StartIndex \u2192 "+a.substring(3));
		System.out.println("StartIndex , EndIndex \u2192 "+a.substring(0,7));
		
		
		System.out.println("\nReplace Char or Words \u2193 ");
		String s = "JaVa " ;
		System.out.println("Char replace \u2192 "+s.replace('a','O'));
		System.out.println("String replace \u2192 "+s.replace("JaVa","AJAY"));
		
		
		System.out.println("\nReplace Using Regex Pattern\u2193 ");
		String r = "abc123 AJAY" ;
		System.out.println("Char replace \u2192 "+r.replaceAll("[1-9]"," "));
		System.out.println("Char replace \u2192 "+r.replaceAll("[a-z]"," "));
		System.out.println("Char replace \u2192 "+r.replaceAll("[A-Z]"," "));
		
		 
	}

}
