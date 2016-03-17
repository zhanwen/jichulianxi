package com.test;

import java.util.Scanner;

public class NumberReader {

	private static String[] label = {"bai", "qian", "wan", "yi"};
	private static String[] number = {"yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi"};
	private static String[] a = {"shi"," ","qian"};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		int len = n.length();
		
		int x = Integer.parseInt(n);
		switch(len)
		{
			case 1: 
				System.out.println(number[x - 1]);
				break;
			
			case 2: 
				if(x % 10 == 0) {
					int s = x / 10;
					System.out.println(number[s-1] + " shi");
				}
				else
				{
					int g = x % 10;
					int s = x / 10;
					System.out.println(number[s-1] + " shi " + number[g-1]);
				}
				break;
			case 3:
				if(x % 100  == 0) {
					int g = x / 100;
					System.out.println(number[g-1] + " " + " bai");
				}
				else
				{
					int g = x % 10;
					int s = x / 10 % 10;
					int b = x / 100;
					System.out.println(number[b-1] + " bai " + number[s-1] + " shi " + number[g-1]);
				}
				break;
			case 4:
				if(x % 1000 == 0) {
					int g = x / 1000;
					System.out.println(number[g-1] + " qian");
				}
				else
				{
					int g = x % 10;
					int s = x / 10 % 10;
					int b = x / 100 % 10;
					int q = x / 1000;
					System.out.println(number[q-1]+ " qian " + number[b-1] + " bai " + number[s-1] + " shi " + number[g-1]);
				}
				break;
			case 5:
				if(x % 10000 == 0) {
					int g = x / 10000;
					System.out.println(number[g-1] + " wan");
				}
				else
				{
					int g = x % 10;
					int s = x / 10 % 10;
					int b = x / 100 % 10;
					int q = x / 1000 % 10;
					int w = x / 10000;
					System.out.println(number[w-1] +" wan " + number[q-1]+ " qian " + number[b-1] + " bai " + number[s-1] + " shi " + number[g-1]);
				}
				break;
			case 6:
				if(x % 100000 == 0) {
					int num = x / 100000;
					if(num == 1) {
						System.out.println("shi wan");
					}
					else {
						System.out.println(number[num-1] + " shi wan");
					}
					
				}
				else
				{
					int g = x % 10;
					int s = x / 10 % 10;
					int b = x / 100 % 10;
					int q = x / 1000 % 10;
					int w = x / 10000 % 10;
					int shiwan = x / 100000;
					System.out.println(number[shiwan-1] +" shi " +   number[w-1] +" wan " + number[q-1]+ " qian " + number[b-1] + " bai " + number[s-1] + " shi " + number[g-1]);
				}
				break;
			case 7:
				if(x % 1000000 == 0) {
					int num = x / 1000000;
					if(num == 1) {
						System.out.println("yi bai wan");
					}
					else {
						System.out.println(number[num-1] + " bai wan");
					}
					
				}
				else
				{
					int g = x % 10;
					int s = x / 10 % 10;
					int b = x / 100 % 10;
					int q = x / 1000 % 10;
					int w = x / 10000 % 10;
					int shiwan = x / 100000 % 10;
					int baiwan = x / 1000000;
					System.out.println(number[baiwan-1] +" bai "+ number[shiwan-1] +" shi " +   number[w-1] +" wan " + number[q-1]+ " qian " + number[b-1] + " bai " + number[s-1] + " shi " + number[g-1]);
				}
				
				break;
			case 8:
				if(x % 10000000 == 0) {
					int num = x / 10000000;
					if(num == 1) {
						System.out.println("yi qian wan");
					}
					else {
						System.out.println(number[num-1] + " qian wan");
					}
					
				}
				else
				{
					int g = x % 10;
					int s = x / 10 % 10;
					int b = x / 100 % 10;
					int q = x / 1000 % 10;
					int w = x / 10000 % 10;
					int shiwan = x / 100000 % 10;
					int baiwan = x / 1000000 % 10;
					int qianwan = x / 10000000;
					System.out.println(number[qianwan-1]+ " qian "+ number[baiwan-1] +" bai "+ number[shiwan-1] +" shi " +   number[w-1] +" wan " + number[q-1]+ " qian " + number[b-1] + " bai " + number[s-1] + " shi " + number[g-1]);
				}
				
				break;
			case 9:
				if(x % 100000000 == 0) {
					int num = x / 100000000;
					if(num == 1) {
						System.out.println("yi yi");
					}
					else {
						System.out.println(number[num-1] + " yi");
					}
					
				}
				else
				{
					int g = x % 10;
					int s = x / 10 % 10;
					int b = x / 100 % 10;
					int q = x / 1000 % 10;
					int w = x / 10000 % 10;
					int shiwan = x / 100000 % 10;
					int baiwan = x / 1000000 % 10;
					int qianwan = x / 10000000 % 10;
					int yi = x / 100000000;
					System.out.println(number[yi-1] + " yi " + number[qianwan-1]+ " qian "+ number[baiwan-1] +" bai "+ number[shiwan-1] +" shi " +   number[w-1] +" wan " + number[q-1]+ " qian " + number[b-1] + " bai " + number[s-1] + " shi " + number[g-1]);
				}
				break;
			case 10:
			
				break;
				
		}
		
		
	
	
	
	
	}
	
	
	
	
}
