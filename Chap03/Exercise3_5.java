package Text.Chap03;

import java.util.Scanner;

public class Exercise3_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("整数値：");
    int n = sc.nextInt();

    if (n > 0) {
      if (n % 5 == 0) {
        System.out.println("その値は5で割り切れます。");
      } else {
        System.out.println("その値は5で割り切れません。");
      }
    } else {
      System.out.println("正でない値が入力されました。");
    }
    sc.close();
  }
}
