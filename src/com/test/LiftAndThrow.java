package com.test;

import java.util.Scanner;

public class LiftAndThrow {

	private final static int TRUE = 1;
	private final static int FALSE = 0;
	
	//定义数组大小为4，从一开始，空出小标为0，方面计算
	private static int[] x = new int[4];		//三个人的位置
	private static int[] l = new int[4];		//三个人的移动
	private static int[] t = new int[4];		//三个人的抛的距离
	
	private static int ans = 0; //经过操作后的最远距离，初始化为0
	private static int[] w = new int[4];		//初始化为0，0表示可以进行操作，非零表示不可以
	private static int[] p = new int[4];		//初始化为0，表示a[i]所举起的人
	
	//初始化为3，表示人的状态，这里a对应的二进制为0011，后三位分别是三个动作：抛出，举起，移动，
	//0（无意义）0（无意义）0（不可抛出）1（未进行举起）1（未进行移动）。
	//这道题中，a只有六个可能值：0(0000)、1(0001)、2(0010)、3(0011)、4(0100)、5(0101)，表示人的六种状态
	private static int[] a = {3, 3, 3, 3};
	public static int near(int s)
	{
		int i = 1;
		for(; i <= 3; i++)
		{
			if(s == x[i] + 1 || s == x[i] - 1)
			{
				return TRUE;
			}
		}
		return FALSE;
	}
	
	public static void dfs(int d) 
	{
		int i = 1, j = 1, e = 0;
		//每次都取得最远的位置
		for(; i <= 3; i++)
		{
			ans = max(ans, x[i]);
		}
		
		for(i = 1; i <= 3; i++)
		{
			//是否可以进行操作
			if(w[i] == 1)
			{
				continue;
			}
			
			//a[i]==1 || a[i] == 3(未进行移动且不可抛出)
			if((a[i] & 1) == 1)
			{
				if(!((a[i] & 4) == 0))
				{
					for(j = 1; j <= l[i]; j++)	//移动
					{
						x[i] += j;	//a[i]向前移动
						a[i] ^= 1;	//已移动
						 if ((near(x[i]) == 1) || j == l[i])                    //如果a[i]移动后的位置旁边有人或者移动距离达到上限
			             {
			                 dfs(d + 1);
			             }
			             x[i] -= j;                                      //归位
			             x[i] -= j;                                      //a[i]向后移动j
			             if ((near(x[i]) == 1) || j == l[i])                    //如果a[i]移动后的位置旁边有人或者移动距离达到上限
			             {
			                 dfs(d + 1);
			             }
			             x[i] += j;                                      //归位
			             a[i] ^= 1;                                      //还原为未移动
					}
				}
			}
			
			
			//a[i] == 2 || a[i] == 3 || a[i] == 5（未进行举起）
	        if ((a[i] & 2) == 1)
	        {
	            for (j = 1; j <= 3; j++)                            //举起
	            {
	                if (i != j && !(w[j]==0) && t[i] > 0)                //是否可以进行操作
	                {
	                    if (x[i] == x[j] + 1 || x[j] == x[i] + 1)   //a[i]附近是否有人
	                    {
	                        w[j] = 1;                               //即将举起（抛出）j，抛出前将j是否可操作标记变更为否
	                        a[i] ^= 2;                              //已举起
	                        a[i] ^= 4;                              //可抛出
	                        p[i] = j;                               //记录a[i]举起（抛出）了j
	                        e = x[j];                               //记录a[j]的举起前位置
	                        x[j] = -j;                              //a[j]（被举起）的位置定为负数，只作用于下一层递归时的取最远位置的循环
	                        dfs(d + 1);
	                        x[j] = e;                               //归位
	                        w[j] = 0;                               //还原为可以进行操作
	                        a[i] ^= 2;                              //还原为未举起
	                        a[i] ^= 4;                              //还原为不可抛出
	                    }
	                }
	            }
	        }
	        
	        
	        if ((a[i] & 4) == 1)
	        {
	            for (j = 1; j <= t[i]; j++)                         //抛出
	            {
	                w[p[i]] = 0;                                    //变更a[j]为可操作（以下a[j]指a[i]所举起的人）
	                a[i] ^= 4;                                      //不可抛出
	                e = x[p[i]];                                    //记录a[j]被举起前位置
	                x[p[i]] = x[i] + j;                             //抛出a[j]，并更新a[j]位置
	                if ((near(x[p[i]])==1) || j == t[i])                 //如果a[j]被抛出后的位置旁边有人或者抛出距离达到上限
	                {
	                    dfs(d + 1);
	                }
	                x[p[i]] -= j;                                   //归位
	                x[p[i]] -= j;                                   //a[j]向后抛出j
	                if ((near(x[p[i]])==1) || j == t[i])                 //如果a[j]被抛出后的位置旁边有人或者抛出距离达到上限
	                {
	                    dfs(d + 1);
	                }
	                x[p[i]] = e;                                    //还原a[j]为未举起前的位置
	                a[i] ^= 4;                                      //还原a[j]为可抛出
	                w[p[i]] = 1;                                    //还原a[j]为不可操作
	            }
	        }
		}
	}
	
	
	
	

	public static int max(int a, int b)
	{
		return a > b ? a : b;
	}
	
	
	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		//输入每个人的信息
		for(; i <= 3; i++)
		{
			x[i] = sc.nextInt();
			l[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		//深度优先遍历
		dfs(1);
		
		System.out.println(ans);
		
		
	}
	
	
	
	
	
}



