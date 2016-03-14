package com.test;

import java.util.Scanner;

public class XToO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		for(int i = 0; i < n; i++) {
			String s = a[i];
			Long d = Long.valueOf(s, 16);
			String str = Long.toOctalString(d);
			System.out.println(str);
		}
		
		  
		
//		String s ="39";
//		int t = object.XtoD(s);
//		System.out.println(t);
//		int o = Integer.parseInt(Integer.toOctalString(t));
//		System.out.println(o);
//		System.out.println(Integer.toHexString(t));
//		Integer n = Integer.valueOf("39", 16);
//		
//		System.out.println();
	}
	
//	public int XtoD (String str) {
//		char[] a = str.toCharArray();
//		
//		int result = 0;
//		int len = a.length;
//		for(int i = 0; i < len; i++) {
//			int d = (int) Math.pow(10, len-i-1);
//			int x = Integer.parseInt(a[i] + "");
//			result += x * d;
//		}
//		return result;
//	}
//	
	
	
	
}
