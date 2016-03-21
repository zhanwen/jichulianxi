package com.test;

import java.util.Scanner;

public class MatrixMultiply2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int s = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] a = new int[m][s];
		int[][] b = new int[s][n];
		int[][] c = new int[m][n];
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < s; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < s; i++)
		{
			for(int j = 0; j < n; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		for(int j = 0; j < m; j++)
		{
			for(int k = 0; k < n; k++)
			{
				for(int x = 0; x < s; x++)
				{
					c[j][k] += a[j][x] * b[x][k];
				}
			}
		}
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
