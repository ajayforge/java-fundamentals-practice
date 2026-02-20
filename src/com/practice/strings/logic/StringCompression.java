package com.practice.strings.logic;

public class StringCompression {
	public static void main(String[] args) {

		String s = "aaabbc";
		int count = 1;
		String out = "";
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				out += s.charAt(i) + String.valueOf(count);
				count = 1;
			}
		}
		out += s.charAt(s.length()-1) + String.valueOf(count);
		
		System.out.println(out);
	}

}
