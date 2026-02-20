package com.practice.arrays;
import java.util.*;
public class TwoDArrayUserInput {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int r = sc.nextInt();
		 int c = sc.nextInt();
		 
		 int [][] a = new int[r][c];
		 int sum =0 ;
		 System.out.println("Enter the 2D array input :");
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 a[i][j] = sc.nextInt();
				 sum +=a[i][j];
			 }
		 }
		 System.out.println(sum+" ");
		  
//		 int i , j , sum = 0;
//		 System.out.println("2D Array Output :");
//		 for( i=0;i<r;i++)
//		 {
//			 for( j=0;j<c;j++)
//			 {
//				 System.out.print(a[i][j]+" ");
//				 sum +=a[i][j];
//			 }
//			 System.out.println();
//		 }
//		 
//		 System.err.println("  ");
//		 System.out.println("Total Sum : "+ sum);
		 sc.close();

	}

}
