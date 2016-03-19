package com.test;

import java.util.Scanner;

public class UpToLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] s = str.toCharArray();
		for(int i = 0; i < s.length; i++)
		{
			if(s[i] >= 'a' && s[i] <= 'z')
			{
				s[i] = (char) (s[i] - 32);
			}
			else
			{
				s[i] = (char) (s[i] + 32);
			}
		}
		String str2 = String.valueOf(s);
		System.out.println(str2);
	}
}
