package com.test;

import java.util.Scanner;

public class TimeAssistant {
	public static void main(String[] args) {
		String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen",
				"fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
		String[] str2 = {"twenty", "thirty","forty","fifty"};
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 0 && b == 0) {
			System.out.print(str[a] + " o'clock");
		}
		if(a > 20 && a < 60) {
			int g = a % 10;
			int s = a / 10;
			System.out.print(str2[s-2] + " " + str[g] + " ");
		}
		if(a > 0 && a <= 20)
		{
			System.out.print(str[a] + " ");
		}
		
		if(b > 20 && b < 60) {
			int g = b % 10;
			int s = b / 10;
			System.out.print(str2[s-2] + " " + str[g]);
		}
		if(b > 0 && b <= 20)
		{
			System.out.print(str[b]);
		}
	}
}
