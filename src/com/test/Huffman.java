package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Huffman {

	public static void main(String[] args) {
		
		  
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(getResult(a,n));
//		System.out.println(count);
	}
	
	public static int getResult(Integer[] a,int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
			
		int temp = a[0] + a[1];
			
		count += temp;
			
		Integer[] c = Arrays.copyOfRange(a, 2, a.length);
		for(int i = 0; i < c.length; i++) {
			list.add(c[i]);
			System.out.print(c[i] + " ");
		}
		list.add(temp);
			
		System.out.println();
			
		for(	Integer l : list) {
			System.out.print(l + " ");
		}
		Integer[] list2 = (Integer[]) list.toArray(a);
		
		getResult(list2,n-1);
			
		
		return count;
	}
	
	
	
	
	
	
	
	
	
}
