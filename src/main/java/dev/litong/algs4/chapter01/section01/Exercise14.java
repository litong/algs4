package dev.litong.algs4.chapter01.section01;

import edu.princeton.cs.algs4.StdOut;
import java.util.Scanner;

public class Exercise14 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StdOut.print("N: ");
    int n = input.nextInt();
    System.out.println(lg(n));
  }

  public static int lg(int n) {
    int result = 0;
    while (n > 0) {
      result++;
      n /= 2;
    }
    return result - 1;
  }
}
