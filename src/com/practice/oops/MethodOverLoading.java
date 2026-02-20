package com.practice.oops;
import java.util.*;
class demo
{
	//Different number of Parameters
	int add(int a,int b)
	{
		return a+b;
	}
	
	int add(int a,int b,int c)
	{
		int res = a+b+c;
		return res;
		

	}
	//Different Data types of parameters
	
	double add(double d,double e)
	{
		return d+e;
	}
}

public class MethodOverLoading {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
	demo dom = new demo();
	int temp = dom.add(a,b,c);
	System.out.println(dom.add(a,b));
	System.out.println(dom.add(a,b,c));
	System.out.println((double)(dom.add(d,e)+temp));
	sc.close();
		
		
		
	}

}
