package dev.litong.algs4.chapter01.section01;

import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input x: ");
    double x = input.nextDouble();
    System.out.print("Please input y: ");
    double y = input.nextDouble();
    System.out.println(isOk(x) && isOk(y));
  }

  public static boolean isOk(double n) {
    return n > 0 && n < 1;
  }
}
