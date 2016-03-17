package com.test;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 != len2){
			System.out.println(1);
		}
		else
		{
			if(str1.equals(str2))
			{
				System.out.println(2);
			}
			else
			{
				String str3 = str1.toUpperCase();
				String str4 = str2.toUpperCase();
				if(str3.equals(str4))
				{
					System.out.println(3);
				}
				else
				{
					System.out.println(4);
				}
				
			}
		}
		
	}
	
	
	
}
