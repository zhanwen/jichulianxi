package com.test;

import java.util.Scanner;

public class QuShu {
	
	private static int  n;
	private static int m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[][] array = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for( int i = 0; i < (n+1) / 2 && i < (m+1)/2; i++) {
			for(int j = i; j < n - i; j++) {
				System.out.print(array[j][i] + " ");
			}
			for(int j = i + 1; j < m - i; j++){
				System.out.print(array[n-i-1][j] + " ");
			}
			if(m-i-1 > i) {
				for(int j = n - i - 2; j >= i; j--) {
					System.out.print(array[j][m-i-1] + " ");
				}
			}
			if(n-i-1 > i) {
				for(int j = m - i - 2; j > i; j--) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
