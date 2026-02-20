package com.practice.strings.builtin;

public class SearchingString {
	public static void main(String[] args) {
		
		System.out.println("Contains Sequence check \u2193 ");
		String s = "Java is Programming ";
		System.out.println("Check Start Part \u2192   "+s.contains("is"));
		
		System.out.println("\nStart with given value");
		System.out.println(s.startsWith("Java"));
		System.out.println(s.startsWith("java"));
		System.out.println(s.startsWith("ing"));
		
		System.out.println("\nEnd with given value");
		System.out.println(s.endsWith("ing "));
		System.out.println(s.endsWith("ING "));
		System.out.println(s.endsWith("Java"));
	}

}
