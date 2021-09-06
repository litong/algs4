package dev.litong.algs4.chapter01.section01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise11 {

  public static void main(String[] args) {
    boolean[][] a = new boolean[][] {{true, true, false}, {false, true}, {false, true}};
    print(a);
  }

  public static void print(boolean[][] a) {

    int maxLength = getMaxLength(a);

    System.out.print("  ");

    for (int i = 1; i <= maxLength; i++) {
      System.out.print(i + " ");
    }

    for(int i = 0; i < a.length; i++) {
      System.out.print( "\n" + (i + 1) + " ");
      for(int j = 0; j < a[i].length; j++) {
        if (a[i][j]) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
    }
    StdOut.println();
  }

  public static int getMaxLength(boolean[][] a) {
    int maxLength = 0;
    for (boolean[] booleans : a) {
      if (booleans.length > maxLength) {
        maxLength = booleans.length;
      }
    }
    return maxLength;
  }
}
