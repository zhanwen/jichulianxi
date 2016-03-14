package com.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class JieCheng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		BigDecimal b = BigDecimal.valueOf(n);
		System.out.println(f(b));
		
	}
	public static BigDecimal f(BigDecimal n) {
		if(n == BigDecimal.ONE) {
			return BigDecimal.ONE;
		}
		else {
			return n.multiply(f(n.subtract(BigDecimal.ONE)));
		}
	}
}
