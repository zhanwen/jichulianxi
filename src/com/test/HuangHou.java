package com.test;

import java.util.Scanner;

public class HuangHou {
	private final static int N = 100;
	private static int[] wq = new int[N]; //黑皇后
	private static int[] bq = new int[N]; //白皇后
	private static int[][] cb = new int[N][N]; //棋盘
	private static int n; //皇后数目
	private static int count = 0; //计数
	
	public static  int bqueen (int pos) {
		for(int i = 0; i < pos - 1; i++) {
			int judge = bq[i] - bq[pos-1];
			if(0 == judge || judge == pos-i-1 || -judge == pos-i-1) {
				return 0;
			}
		}
		if(pos == n) 
		{
			count++;
		}
		for(int i = 0; i < n; i++) {
			if(cb[pos][i] == 1) 
			{
				if(i != wq[pos]) {
					bq[pos] = i;
					bqueen(pos+1);
				}
			}
			
		}
		return 0;
	}
	public static int wqueen(int pos) {
		
		for(int i = 0; i < pos - 1; i++) {
			int judge = wq[i] - wq[pos-1];
			
			if(0 == judge || judge == pos-i-1 || -judge == pos-i-1) {
				return 0;
			}
		}
		if(pos == n) {
			bqueen(0);
			return 0;
		}
		for(int i = 0; i < n; i++) {
			if(cb[pos][i] == 1) {
				wq[pos] = i;
				wqueen(pos+1);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				cb[i][j] = sc.nextInt();
			}
		}
		
		wqueen(0);
		
		System.out.println(count);
	} 
}
