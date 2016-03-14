package com.test;

import java.util.Scanner;

public class KHaoShu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int k = sc.nextInt();
		long[][] f = new long[101][101];
		long sum = 0;
		for(int i=0;i<=k-1;i++)
		{
			f[1][i]=1;
		}
			    
		for(int i=2;i<=l;i++)  
		{  
			for(int j=0;j<=k-1;j++)  
			{  
				   for(int p=0;p<=k-1;p++)  
				   {
					   if(p!=j-1&&p!=j+1)  
					   f[i][j]+=f[i-1][p]%1000000007;   
				   }
				   
			       
			}  
		}  
		for(int i=1;i<=k-1;i++)
		{
			sum+=f[l][i]%1000000007; 
		}
		System.out.println(sum%1000000007);

		
	}
	
	
	
//	public static long ToK (long l, long k) {
//		long result = 0;
//		long[] a = new long[1000000];
//		
//		long start = (long) Math.pow(10, l-1);
//		long end = (long)Math.pow(10, l);
//		for(long i = start; i < end; i++) {
//			int j = 0;
//			while(i != 0)
//			{
//				a[j++] = i % k;
//				i = i / k;
//			}
//			for(int m = 1; m < j; m++) {
//				long v = Math.abs(a[m] - a[m+1]);
//				long v2 = Math.abs(a[m] - a[m-1]);
//				if(v == 1 || v2 == 1) {
//					
//				}
//				else
//				{
//					result++;
//				}
//			}
//		}
		
		
		
//		
//		return result % 1000000007;
//	}
	
	
	
	
}
