package com.test;

import java.util.Scanner;

public class GuiTu {
	
	private static final String T = "T";
	private static final String R = "R";
	private static final String D = "D";
	
	public static void race(int v1, int v2, int t, int s, 
			int l, int start1, int start2, int s1, int s2, int time, boolean rest) {
		if( v1 < 0 || v2 < 0 || t < 0 || s < 0 || l < 0 
                || v1 > 100 || v2 > 100 || t > 300 || s > 10 || l > 10000
                || l % v1 != 0 || l % v2 != 0) {
			try{
				throw new Exception("参数不合法");
			}catch(Exception e) {
				
			}
		}
		else {
			if(s1 >= l || s2 >= l) {
				if(s1 > s2) {
					System.out.println(R);
					System.out.println(time + start1);
				}
				else if(s1 < s2) {
					System.out.println(T);
					System.out.println(start2);
				}
				else {
					System.out.println(D);
					System.out.println(start2);
				}
				return;
			}
			if(!rest && s1 - s2 >= t) {
				rest = true;
				time += s;
			}
			if(rest && start2 - start1 >= s) {
				rest = false;
			}
			if(!rest) {
				start1++;
				s1 = v1 * start1;
			}
			start2++;
			s2 = v2 * start2;
			race(v1,v2,t,s,l,start1,start2,s1,s2,time,rest);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int l = sc.nextInt();
		
		race(v1,v2,t,s,l,0,0,0,0,0,false);
	}
	
	
}
