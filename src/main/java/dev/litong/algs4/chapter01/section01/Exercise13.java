package dev.litong.algs4.chapter01.section01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {

  public static void main(String[] args) {
    int[][] matA = new int[][]{
        {1,3,4},
        {4,5,7}
    };

    int[][] matB = transpose(matA);
    for (int[] numbers : matB) {
      for (int num : numbers) {
        StdOut.printf("%d ", num);
      }
      StdOut.println();
    }
  }

  public static int[][] transpose(int[][] mat) {
    int[][] newMat = new int[mat[0].length][mat.length];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        newMat[j][i] = mat[i][j];
      }
    }
    return newMat;
  }
}
