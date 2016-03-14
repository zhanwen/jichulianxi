package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Quene {

	public static int sum (int[] a) {
		int sum = 0;
		for(int i = 0 ; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int result = sum(a);
		
		System.out.println(a[a.length - 1]);
		System.out.println(a[0]);
		System.out.println(result);
	}
	
}
