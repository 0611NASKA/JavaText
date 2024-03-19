package Text.Chap03;

import java.util.Scanner;

public class Exercise3_13 {
  public static void main(String[] main) {
    Scanner sc = new Scanner(System.in);

    System.out.print("整数a：");
    int a = sc.nextInt();
    System.out.print("整数b：");
    int b = sc.nextInt();
    System.out.print("整数c：");
    int c = sc.nextInt();

    int mid;
    if ((a >= b && a <= c) || (a <= b && a >= c)) {
      mid = a;
    } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
      mid = b;
    } else {
      mid = c;
    }
    System.out.println("中央値は" + mid + "です。");
    sc.close();
  }
}
