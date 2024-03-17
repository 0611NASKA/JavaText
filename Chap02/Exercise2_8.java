package Text.Chap02;

import java.util.Random;
import java.util.Scanner;

public class Exercise2_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    System.out.print("整数値：");
    int x = sc.nextInt();

    int random = rd.nextInt(11) - 5;
    System.out.println("その値の±5の乱数を生成しました。それは" + (x + random) + "です。");
    sc.close();
  }
}
