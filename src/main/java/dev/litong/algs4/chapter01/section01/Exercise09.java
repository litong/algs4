package dev.litong.algs4.chapter01.section01;

import java.util.Scanner;

public class Exercise09 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a number: ");
    int N = input.nextInt();
    System.out.println(Integer2String(N));
  }

  public static String Integer2String(int N) {
    StringBuilder result = new StringBuilder();
    while (N > 0) {
      result.insert(0, N % 2);
      N /= 2;
    }
    return result.toString();
  }
}
