package Text.Chap03;

import java.util.Scanner;

public class Exercise3_9 {
  public static void main(String[] main) {
    Scanner sc = new Scanner(System.in);

    System.out.print("整数a：");
    double a = sc.nextDouble();
    System.out.print("整数b：");
    double b = sc.nextDouble();

    System.out.println("大きいほうの値は" + (a > b ? a : b) + "です。");
    sc.close();
  }
}
