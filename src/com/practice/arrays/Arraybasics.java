	package com.practice.arrays;
	import java.util.Arrays;
	public class Arraybasics {
	
		public static void main(String[] args) {
	      
			/// Normal method
			int[] a = { 21, 23, 24, 34 };
			//  Method 2
			int[] b = new int[4];
			b[0] = 90;
			b[1] = 100;
			b[2] = 30;
			b[3] = 20;
			
			int sum = 0;
	
			System.out.printf("%d : %n",a.length);
	
			for (int i = 0; i < b.length; i++) {
				if (b[i] == 30)
					continue;
				sum += b[i];
			}
			
			System.out.println("\n"+sum);
				
			//Sorting  
			Arrays.sort(b);
			System.out.println("\n"+Arrays.toString(b)); 
			
			
		}
	}
