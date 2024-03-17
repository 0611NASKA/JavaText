package Text.Chap02;

import java.util.Scanner;

public class Exercise2_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("三角形の面積を求めます。");

    System.out.print("底辺:");
    double x = sc.nextDouble();

    System.out.print("高さ:");
    double y = sc.nextDouble();

    System.out.println("面積は" + ((x * y) / 2) + "です。");
  }
}
