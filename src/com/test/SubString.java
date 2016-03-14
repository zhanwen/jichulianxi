package com.test;

public class SubString {

	public static void main(String[] args) {
		
		SubString ss = new SubString();
		ss.print(32);
	}
	
	public void print (int n ) {
		for(int i = 0; i < n; i++) {
			String s = Integer.toBinaryString(i);
			while(s.length() < 5) {
				s = "0" + s;
			}
			System.out.printf("%5s",s);
			System.out.println();
		}
	}
}  
