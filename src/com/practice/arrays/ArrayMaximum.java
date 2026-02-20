package com.practice.arrays;
import java.util.*;
public class ArrayMaximum {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 int a = sc.nextInt();
		 
		 int [] b = new int[a];
		 int max =0;
		 for(int i=0;i<a;i++)
		 {
			 b[i] = sc.nextInt();	
			 if(b[i]>max)
			 {
				 max = b[i];
			 }
		 }
		 System.out.println(max);
		 sc.close();
		 


}
}
