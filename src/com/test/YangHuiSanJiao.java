package com.test;

import java.util.Scanner;

public class YangHuiSanJiao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int [n][n];
		
		for(int i = 0; i < n; i++) {
			a[i][0] = 1;
			for(int j = 0; j <= i; j++) {
				if(i == j) {
					a[i][j] = 1;
				}
			}
		}
		
		for(int i = 2; i < n; i++) {
			for(int j = 1; j <= i; j++) {
				
				a[i][j] = a[i-1][j] + a[i-1][j-1];
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
