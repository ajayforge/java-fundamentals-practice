package com.practice.strings.logic;

public class CompareTwoStrings {
	public static void main(String[] args) {

		String a = "AJAY";
		String s = "AJAy";

		boolean Equal = true;

		if (a.length() != s.length())
			Equal = false;
		else {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != (s.charAt(i))) {
					Equal = false;
					break;
				}
			}
		}
		if(Equal)
		{
			System.out.println("Strings are Equal");
		}
		else
		{
			System.out.println("Strings are Not Equal");
		}

	}
}
