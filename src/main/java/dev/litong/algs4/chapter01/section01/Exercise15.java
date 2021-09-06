package dev.litong.algs4.chapter01.section01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise15 {

  public static void main(String[] args) {
    int[] a = new int[] {2, 4, 5, 6, 1, 2, 5};
    int[] b = histogram(a, 6);
    for (int num : b) {
      StdOut.printf("%d ", num);
    }
  }

  public static int[] histogram(int[] a, int M) {
    int[] numbers = new int[M];
    for (int num : a) {
      if (num < M) {
        numbers[num]++;
      }
    }
    return numbers;
  }
}
