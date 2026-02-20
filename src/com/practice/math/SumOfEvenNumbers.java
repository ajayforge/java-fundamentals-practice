package com.practice.math;
import java.util.*;
public class SumOfEvenNumbers {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  int n =sc.nextInt();
	  
	  int [] a =new int[n];
	  int sum1 = 0,sum2 = 0;
	  int even = 0, odd = 0;
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
		  if(a[i]%2==0)
		  {
			  sum1 +=a[i]; //--> Even Sum
			  even++;
		  }
		  else
		  {
			  sum2 +=a[i]; //-->Odd Sum
			  odd++;
		  }
	  }
	  System.out.println("  Even Sum : "+sum1+"\n"+"Even count : "+even);
	  System.out.println("   Odd Sum : "+sum2+"\n"+" Odd count : "+odd);
	  
	  sc.close();
	  
}
}
