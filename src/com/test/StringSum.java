package com.test;

import java.util.Scanner;

public class StringSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String str = sc.next();
		int len = str.length();
		
		int ma = 0;
		String ans = "";
		for(int i = l; i <= len; i++)
		{
			for(int j = 0; j + i <= len; j++)
			{
				int cnt = 0;
				String temp1 = str.substring(j, i);
				
				for(int k = j; k + i <= len; k++)
				{
					String temp2 = str.substring(k, i);
					
					if(temp1 == temp2)
					{
						cnt++;
					}
				}
				
				if(cnt >= ma)
				{
					if(cnt > ma)
					{
						ma = cnt;
						ans = temp1;
					}
					if(cnt == ma)
					{
						int l1 = ans.length();
						int l2 = temp1.length();
						
						if(l2 > l1)
						{
							ans = temp1;
						}
					}
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
	
	
}
