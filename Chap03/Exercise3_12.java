package Text.Chap03;

import java.util.Scanner;

public class Exercise3_12 {
  public static void main(String[] main) {
    Scanner sc = new Scanner(System.in);

    System.out.print("整数a：");
    int a = sc.nextInt();
    System.out.print("整数b：");
    int b = sc.nextInt();
    System.out.print("整数c：");
    int c = sc.nextInt();

    int min = a;
    if (b < min)
      min = b;
    if (c < min)
      min = c;
    System.out.println("最小値は" + min + "です。");
    sc.close();
  }
}
