package com.test;

import java.util.Scanner;

public class ZimuTeZheng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		print(n,m);
	}
	public static void print(int n, int m) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				char s = (char) ('A' + Math.abs(i-j));
				System.out.print(s);
			}
			System.out.println();
		}
	}
}
