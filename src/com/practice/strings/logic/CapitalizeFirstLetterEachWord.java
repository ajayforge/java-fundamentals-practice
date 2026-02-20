package com.practice.strings.logic;

public class CapitalizeFirstLetterEachWord {
	public static void main(String[] args) {
		String s = "java is a fun language of india";

		boolean FL = true;

		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == ' ') {
				res += c;
				FL = true;
			} else {
				if (FL) {
					res += Character.toUpperCase(c);
					FL = false;	
				}
				else {
					res +=c;
				}
			}

		}
		System.out.println(res);
	}

}
