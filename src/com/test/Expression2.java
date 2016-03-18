package com.test;

import java.util.Scanner;

public class Expression2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String str = Integer.toBinaryString(n);
		
		char[] a = str.toCharArray();
		
		
		display(a);
		
		
		
	}
	
	
	
	public static void display(char[] a)
	{
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == '1')
			{
				if(a.length - i - 1 == 0)
				{
					System.out.print("2(0)");
				}
				else if(a.length - i - 1 == 1)
				{
					if(i == 0 || i % 2 != 0)
					{
						System.out.print("2+");
					}
					else
					{
						System.out.print("2");
					}
					
				}
				else if(a.length - i - 1 == 2)
				{
					System.out.print("2(2)+");
				}
				else
				{
					char[] d = Integer.toBinaryString((a.length - i - 1)).toCharArray();
					System.out.print("2(");
					display(d);
					System.out.print(")+");
				}
				
			}
		}
	}
	
	
	
	
}
