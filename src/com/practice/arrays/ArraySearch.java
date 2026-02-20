package com.practice.arrays;

import java.util.*;

public class ArraySearch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a  = {20,56,78,90,45};
		
		int key  = sc.nextInt();
		boolean found = false;
		
		for(int element : a)
		{
			if(key==element)
			{
				found = true;
			}
			
		}
		System.out.println(found ? "Found" : "Not Found ");
//		if(found) System.out.println("Found the Element : "+key);
//		
//		else System.out.println("Not Found Element");

		sc.close();
		
	}

}
