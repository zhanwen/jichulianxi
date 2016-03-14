package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KBigDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> rs = new ArrayList<Integer>();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			rs.add(sc.nextInt());
		}
		int m = sc.nextInt();
		
		while(m-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int k = sc.nextInt();
			
			ArrayList<Integer> pre = getPartArray(rs, l-1, r-1);
				Collections.sort(pre);
				System.out.println(pre.get(pre.size() - k));
		}
	}
	
	public static ArrayList<Integer> getPartArray(ArrayList<Integer> rs, int l, int k) {
		
		ArrayList<Integer> prs = new ArrayList<Integer>();
		
		for(int i = l; i <= k; i++) {
			prs.add(rs.get(i));
		}
		
		return prs;
	}
}
