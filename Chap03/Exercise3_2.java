package Text.Chap03;

import java.util.Scanner;

public class Exercise3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("整数A：");
    int a = sc.nextInt();

    System.out.print("整数B：");
    int b = sc.nextInt();

    if (a % b == 0) {
      System.out.println("BはAの約数です。");
    } else {
      System.out.println("BはAの約数ではありません。");
    }
  }
}
