package com.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class AAddB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		
		BigDecimal result = a.add(b);
		System.out.println(result);
	}
}
