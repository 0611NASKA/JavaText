package Text.Chap02;

import java.util.Scanner;

public class Exercise2_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("整数値:");
    int x = sc.nextInt();
    System.out.println("10を加えた値は" + (x + 10) + "です。");
    System.out.println("10を減じた値は" + (x - 10) + "です。");
  }
}
