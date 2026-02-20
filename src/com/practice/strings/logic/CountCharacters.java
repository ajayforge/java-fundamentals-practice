package com.practice.strings.logic;

import java.util.Scanner;

public class CountCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String rev ="";
		int count = 0;
		
		for(int i=0;i<s.length();i++)
		{
			rev +=s.charAt(i);
			count++;
			
		}
		
		System.out.println(rev+" \u2192 "+count+" Characters");
		sc.close();
	}
}
