package com.test;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
		double x3 = sc.nextDouble(), y3 = sc.nextDouble(), x4 = sc.nextDouble(), y4 = sc.nextDouble();
		
		
		double maxx = Math.max(x1, x2), minx = Math.min(x1, x2), maxy = Math.max(y1, y2), miny = Math.min(y1, y2);
		double bigx = Math.max(x3, x4), sminx = Math.min(x3, x4), bigy = Math.max(y3, y4), sminy = Math.min(y3, y4);
		
		if(sminx > maxx || minx > bigx || sminy >= maxy || miny >= bigy)
		{
			System.out.println("0.00");
		}
		else
		{
			double xx = Math.max(minx, sminx), yy = Math.max(miny, sminy);
			double x = Math.min(bigx, maxx), y = Math.min(maxy, bigy);
			
			System.out.println(String.format("%.2f", (Math.abs(x-xx) * Math.abs(y-yy))));
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
