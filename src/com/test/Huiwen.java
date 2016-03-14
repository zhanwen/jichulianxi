package com.test;

import java.util.Scanner;

public class Huiwen {
	
	public static void main(String[] args) {
	  	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a = 1; a < 10; a++) {
			for(int b = 0; b < 10; b++) {
				for(int c = 0; c < 10; c++) {
					for(int d = 0; d < 10; d++) {
						for(int e = 0; e < 10; e++) {
							int r = a + b + c + d + e;
							if(n == r) {
								int sum = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
								if(a == e && b == d){
									System.out.println(sum);
								}
							}
						}
					}
				}
			}
		}
		
		for(int a = 1; a < 10; a++) {
			for(int b = 0; b < 10; b++) {
				for(int c = 0; c < 10; c++) {
					for(int d = 0; d < 10; d++) {
						for(int e = 0; e < 10; e++) {
							for(int f = 0; f < 10; f++) {
								int r = a + b + c + d + e + f;
								if(n == r) {
									int sum = a * 100000 + b * 10000 + c * 1000 + d * 100 + e * 10 + f;
									if(a == f && b == e && c == d){
										System.out.println(sum);
									}
								}
							}
							
							
						}
					}
				}
			}
		}
		
		
		
		
	}
	
	
}
