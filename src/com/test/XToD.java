package com.test;

import java.util.Scanner;

public class XToD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		Long value = Long.valueOf(n, 16);
		System.out.println(value);
	}
	
}
  