package com.test;

import java.util.Scanner;

public class Expression3 {

	public static void put(int num,int n){//num为当前数，n为几次方 
		
	    if(num==0)return;//结束条件，分解结束 
	    
	    int r=num%2;//最后一位取出来 
	    
	    num=num>>1;//右移一位 
	    
	    put(num,n+1);//下一位次方 +1 
	    
	    if(num != 0 && r != 0 )
	    		System.out.print("+");//前面和当前位非0的时候输出'+'号 
	    
	    if(r != 0){//当前最后一位 非0 那么输出对应的表示 
	        if(n==1)
	        		System.out.print("2");
	        else{
	        		System.out.print("2(");
	            if (n==0)
	            		System.out.print("0");
	            else 
	            		put(n,0);//次方大于等于2 时，继续分解 
	            System.out.print(")");
	        }
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		put(num, 0); //刚开始 最后一位 是0次方
	}
	
}
