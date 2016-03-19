package com.test;

import java.util.Scanner;

public class TExpression {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		switch(c)
		{
			case "+":	System.out.println(add(a,b)); break;
			case "-": 	System.out.println(sub(a,b)); break;
			case "*": 	System.out.println(multiply(a,b)); break;
			case "/":	System.out.println(mod(a,b)); break;
		}
	}
	
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static int sub(int a, int b)
	{
		return a - b;
	}
	
	public static int multiply(int a ,int b)
	{
		return a * b;
	}
	public static int mod(int a, int b)
	{
		return a / b;
	}
}
