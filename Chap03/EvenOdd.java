package Text.Chap03;

import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数値：");
    int n = stdIn.nextInt();

    if (n > 0)
      if (n % 2 == 0)
        System.out.println("その値は偶数です。");
      else
        System.out.println("その値は奇数です。");
    else
      System.out.println("正でない値が入力されました。");
    stdIn.close();
  }
}
