package com.test;

import java.util.Scanner;

public class MatrixMultiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[35][35];
		int[][] b = new int[35][35];
		int[][] c = new int[35][35];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		//对c数组进行初始化
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < c[i].length; j++)
			{
				c[i][j] = 0;
			}
		}
		
		if(m != 0)
		{
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					b[i][j] = a[i][j];
				}
			}
			
			//借助b数组和c数组来完成矩阵的乘机，将两个矩阵相乘保存在c数组中
			for(int i = 0; i < m-1; i++)
			{
				for(int j = 0; j < n; j++)
				{
					for(int k = 0; k < n; k++)
					{
						for(int x = 0; x < n; x++)
						{
							c[j][k] += b[j][x] * a[x][k];
						}
					}
				}
				//将c数组转向b数组
				for(int e = 0; e < n; e++)
				{
					for(int f = 0; f < n; f++)
					{
						b[e][f] = c[e][f];
					}
				}
				//对c数组进行清零，进行下一次的矩阵乘
				for(int w = 0; w < n; w++)
				{
					for(int q = 0; q < c[w].length; q++)
					{
						c[w][q] = 0;
					}
				}
				
				
			}
			
		}
		else
		{
			//对b数组进行初始化
			for(int k = 0; k < n; k++)
			{
				for(int l = 0; l < b[k].length; l++)
				{
					b[k][l] = 0;
				}
			}
			
			//矩阵的零次幂为单位矩阵
			for(int i = 0; i < n; i++)
			{
				b[i][i] = 1;
			}
		}
		
		
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
	
}
