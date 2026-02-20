package com.practice.math;
import java.util.*;
public class PrimeNumberCheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		for(int j=1;j<=a;j++)
		{
			int f =0;
		for(int i=1;i<=j;i++)
		{
			if(j%i==0)
				f++;
		}
		if(f==2)
		{
			System.out.println("Prime num     : "+j);
			
		}
		else
		{
			System.out.println("Not Prime num : "+j);
		}
		sc.close();
	}

}
}
