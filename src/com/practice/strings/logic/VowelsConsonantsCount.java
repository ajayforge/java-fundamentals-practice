package com.practice.strings.logic;

public class VowelsConsonantsCount {
	public static void main(String[] args) {

		String s = "Education";
		String Vowels = "";
		int vow = 0;

		String Consonants = "";
		int cons = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if ("aeiouAEIOU".indexOf(c) != -1) {
				Vowels += c;
				vow++;
			} else if (Character.isLetter(c)) {
				Consonants += c;
				cons++;
			}
		}
		System.out.println("Vowels \u2192 "+Vowels+"  Count  \u2192 "+vow);
		System.out.println("Consonants  \u2192 "+Consonants+"  Count  \u2192 "+cons);
	}

}