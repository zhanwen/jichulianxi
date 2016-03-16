package com.test;

import java.util.Scanner;

public class FJString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fj(n);
	}
	public static void fj(int n) {
		if(n >= 1) {
			fj(n-1);
			System.out.print((char)('A' + (n-1)));
			fj(n-1);
		}
	}
}
