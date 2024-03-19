package Text.Chap03;

import java.util.Scanner;

public class Exercise3_10 {
  public static void main(String[] main) {
    Scanner sc = new Scanner(System.in);

    System.out.print("整数a：");
    int a = sc.nextInt();
    System.out.print("整数b：");
    int b = sc.nextInt();

    System.out.println("値の差は" + (a > b ? a - b : b - a) + "です。");
    sc.close();
  }
}
