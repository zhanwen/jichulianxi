package com.test;

public class TeshuHuiwen {

	public static void main(String[] args) {
		for(int i = 1000; i < 10000; i++) {
			int g = i % 10;
			int s = i / 10 % 10;
			int b = i / 100 % 10;
			int q = i / 1000;
			if(g == q && s == b) {
				System.out.println(i);
			}
		}	
		
	}
	
	
}
