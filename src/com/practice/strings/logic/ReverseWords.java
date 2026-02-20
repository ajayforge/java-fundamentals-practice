package com.practice.strings.logic;

public class ReverseWords {
	public static void main(String[] args) {

		String s = "Senthil Pakura mari erukan";
		String rev = "";
		System.out.println(s);

		String[] a = s.split(" ");
		for (int i = a.length-1; i >= 0; i--) {
			rev += a[i] + " ";
		}
		System.out.println("\n" + rev);
	}

}
