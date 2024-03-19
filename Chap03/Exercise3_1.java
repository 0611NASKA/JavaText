package Text.Chap03;

import java.util.Scanner;

public class Exercise3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("整数値：");
    int a = sc.nextInt();

    if (a < 0) {
      a *= -1;
    }

    System.out.println("その絶対値は" + a + "です。");
    sc.close();
  }
}
