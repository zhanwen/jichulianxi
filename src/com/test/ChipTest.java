package com.test;

import java.util.Scanner;

public class ChipTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int j = 0; j < n; j++) {
			int count = 0;
			
			for(int i = 0; i < n; i++) {
				count += a[i][j];
			}
			
			if(count > n/2) {
				System.out.print((int)(j+1) + " ");
			}
			
		}
	}
	
}
