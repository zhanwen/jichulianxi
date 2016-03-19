package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0 || n == -1)
		{
			System.out.println();
			return;
		}
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int loc = 0; 
		int maxlen = 1, len = 1;
		for(int i = 1; i < n; i++)
		{
			if(a[i] == a[i-1])
			{
				len++;
			}
			else if(len > maxlen)
			{
				maxlen = len;
				len = 1;
				loc = i - 1;
			}
			else
				len = 1;
		}
		System.out.println(a[loc]);
		
		
		
		
		
		
	}
}
