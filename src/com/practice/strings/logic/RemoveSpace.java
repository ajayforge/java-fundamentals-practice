package com.practice.strings.logic;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		 s = s.replace(" ","");
		System.out.println(s);
		sc.close();
	}

}
