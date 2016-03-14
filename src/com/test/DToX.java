package com.test;

import java.util.Scanner;

public class DToX {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s = Integer.toHexString(n);
		String str = s.toUpperCase();
		System.out.println(str);
	}
	
}
