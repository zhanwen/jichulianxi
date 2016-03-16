package com.test;

import java.util.Scanner;

public class Sine {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(s(n,1));
	}
	
	public static String s(int n, int i) {
		if(i == n) {
			return "" + An(n) + "+" + (n-i+1);
		}
		else{
			return "(" + An(i) + "+" + (n-i+1) + ")" +"" + s(n, i+1) + "";
		}
	}
	public static String An(int n) {
		return sin(n,1);
	}
	public static String sin(int n, int i) {
		if(i == n) {
			return "sin(" + n + ")";
		}
		else
		{
			if(i%2 == 0) {
				return "sin(" + i + "+" + sin(n, i+1) + ")"; 
			}
			else
			{
				return "sin(" + i + "-" + sin(n, i+1) + ")";
			}
		}
	}
}
