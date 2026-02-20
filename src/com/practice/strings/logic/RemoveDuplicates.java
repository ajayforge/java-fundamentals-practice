package com.practice.strings.logic;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Progamming" ;
		String res = "";
		System.out.println("-1.indexOf('P')==-1)  -->  res is empty So Not  P here so return -1 is true");
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (res.indexOf(c) == -1) {
				res += c;
			}
		}
		System.out.println(res);
		sc.close();

	}

}
