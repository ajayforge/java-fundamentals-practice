package com.practice.strings.logic;

public class ReverseEachWords {
	public static void main(String[] args) {

		String s = "Java is a Fun Language of India";

		String[] a = s.split(" ");
		String rev = "";
		for (int i = 0; i < a.length; i++) {
			String word = a[i];
			String rev1 = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				rev1 += word.charAt(j);

			}
				rev += rev1+" ";
		}
		System.out.println(rev.trim());

	}

}
