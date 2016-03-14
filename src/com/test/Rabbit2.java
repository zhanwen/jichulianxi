package com.test;

import java.util.Scanner;

public class Rabbit2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int l = sc.nextInt();
		
		int tR = l / v1;
		int tT = l / v2; 
		int sR = v1;
		int sT = v2;
		
		while(sR < l && sT < l) {
			if(sR - sT >= t) {
				tR = s + tR;
				sT += (s * v2);
			}
			else {
				sT += v2;
				sR += v1;
			}
		}
		if(tR > tT) {
			System.out.println("T");
			System.out.println(tT);
		}
		else if(tR < tT) {
			System.out.println("R");
			System.out.println(tR);
		}
		else {
			System.out.println("D");
			System.out.println(tR);
		}
		
	}
}
