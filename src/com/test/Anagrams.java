package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char[] a = str1.toLowerCase().toCharArray();
		char[] b = str2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == b[i])
			{
				count++;
			}
		}
		if(count == a.length)
		{
			System.out.println("Y");
		}
		else
		{
			System.out.println("N");
		}
	}
}
