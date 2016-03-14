package com.test;

import java.util.Scanner;

public class SearchInteger {
	public static void main(String[] args) {
		SearchInteger f = new SearchInteger();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		
		
		int x = sc.nextInt();
		int result = f.find(n, a, x);
		System.out.println(result);
//		Arrays.sort(a);
//		int result = Arrays.binarySearch(a, x);
//		for(int i = 0; i < n; i++) {
//			
//			if(x == a[i]) {
//				System.out.println(i + 1);
//				break;
//			}
//		}
//		for(Integer aa : a){
//			System.out.print(aa + " ");
//		}
//		System.out.println(result + 1);
		
		
	}
	
	public int find(int n, int[] a, int x) {
		int index = -1;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == x) {
				index = i + 1;
				break;
			}
		}
		return index;
		
		
		
		
		
	}
	
	
	
}
