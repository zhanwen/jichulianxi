package com.test;

import java.util.Scanner;

public class PrimeNumber {

  static final int CONSTANT = 10000;

  static final int[] ARRAY = new int[CONSTANT + 1];

  static int[] primes = new int[1229];

  static {
    createPrimes();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNext()) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      primeFactors(a, b);
    }
  }

  private static void primeFactors(int a, int b) {
    for (; a <= b; a++) {
      int temp = a;
      System.out.print(a + "=");

      int i = 0;
      while (temp != 1) {
        if (temp % primes[i] == 0) {
          temp /= primes[i];
          System.out.print(primes[i]);
          System.out.print(temp == 1 ? "\r\n" : "*");
        } else {
          i++;
        }
      }
    }
  }

  private static void createPrimes() {
    for (int i = 2; i <= CONSTANT; i++) {
      if (ARRAY[i] == 0) {
        for (int j = i * 2; j <= CONSTANT; j += i) {
          ARRAY[j] = 1;
        }
      }
    }

    int k = 0;
    for (int i = 2; i <= CONSTANT; i++) {
      if (ARRAY[i] == 0) {
        primes[k++] = i;
      }
    }
  }
}