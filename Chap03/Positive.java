package Text.Chap03;

import java.util.Scanner;

public class Positive {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数値：");
    int n = stdIn.nextInt();

    if (n > 0)
      System.out.println("その値は正です。");
  }
}
