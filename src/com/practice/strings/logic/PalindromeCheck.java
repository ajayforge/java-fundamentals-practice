package com.practice.strings.logic;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String temp = s;
		String rev ="";
		
		for(int i = temp.length()-1;i>=0;i--)
		{
			rev +=temp.charAt(i);
		}
		
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println(" String is Palindrome ");
		}
		else
		{
			System.out.println(" String is Not a Palindrom ");
		}
		sc.close();
	}

}
