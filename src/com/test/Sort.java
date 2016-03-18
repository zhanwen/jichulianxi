package com.test;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		int m = max(max(a,b), c);
		if(m == a)
		{
			int n = max(b,c);
			if(n == b)
			{
				System.out.println(m + " " + n + " " + c);
			}
			else
			{
				System.out.println(m + " " + n + " " + b);
			}
		}
		if(m == b)
		{
			int n = max(a,c);
			if(n == a)
			{
				System.out.println(m + " " + n + " " + c);
			}
			else
			{
				System.out.println(m + " " + n + " " + a);
			}
		}
		if(m == c)
		{
			int n = max(a,b);
			if(n == a)
			{
				System.out.println(m + " " + n + " " + b);
			}
			else
			{
				System.out.println(m + " " + n + " " + a);
			}
		}
		
	}
	
	public static int max(int a, int b){
		return a >= b ? a : b;
	}
}
