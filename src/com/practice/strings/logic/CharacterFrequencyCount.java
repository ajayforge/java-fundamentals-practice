package com.practice.strings.logic;

public class CharacterFrequencyCount {
	public static void main(String[] args) {

		String s = "Banana";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == c) {
					count++;

				}

			}
			if (s.indexOf(c) == i) {
				System.out.println(c + " = " + count);
			}
		}

	}
}