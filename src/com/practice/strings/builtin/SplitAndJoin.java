package com.practice.strings.builtin;

public class SplitAndJoin {
	public static void main(String[] args) {
		System.out.println("Split() String into Multiple Parts Based on Delimeter \u2193 ");
		String a = " Java , Hello , World , AJAY " ;
		System.out.println("Call Index \u2192 "+a.split(",")[2]);
		String[] s = a.split(",");
		
		System.out.println("\nReturn output String Arrays");
		for(String bow : s)
		{
			System.out.println(bow);
		}
		
		System.out.println("\n Joins multiple String in One String Delimeter  \u2193 ");
		
		String result = String.join(" \u2192 ","  07","12","2003");
		System.out.println(" Combines String \u2192 "+result);
		String result1 = String.join(" \u2192 ","  AJAy"," 07","12","2003");
		System.out.println(" Combines String \u2192 "+result1);
				
		}

}
