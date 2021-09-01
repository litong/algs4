package dev.litong.algs4.chapter01.section01;

import edu.princeton.cs.algs4.StdOut;
import java.util.Scanner;

public class Exercise03 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input the first number: ");
    int num1 = input.nextInt();
    System.out.print("Please input the second number: ");
    int num2 = input.nextInt();
    System.out.print("Please input the third number: ");
    int num3 = input.nextInt();
    StdOut.println(num1 == num2 && num2 == num3 ? "equal" : "not equal");
  }
}
