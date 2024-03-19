package Text.Chap03;

import java.util.Scanner;

public class Exercise3_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("aの値：");
    double a = sc.nextDouble();

    System.out.print("bの値：");
    double b = sc.nextDouble();

    if (a > b) {
      System.out.println("aの方が大きいです。");
    } else if (a < b) {
      System.out.println("bの方が大きいです。");
    } else {
      System.out.println("aとbは同じ値です。");
    }
    sc.close();
  }
}
