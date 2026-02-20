package com.practice.math;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int  num =  sc.nextInt();
		int temp = num,rem;
		int sum = 0;
		int digit = String.valueOf(num).length();
		
		
		while(temp>0)
		{
			rem = temp%10;
			sum += Math.pow(rem, digit);
		
			temp = temp/10;
			
		}
		System.out.println(sum);
		
		if(num==sum)
			{
				System.out.println("Amrstrong number : "+sum);
			}
			else
			{
				System.out.println("Not Amrstrong number : "+sum);
			}
		sc.close();
		}
	}

