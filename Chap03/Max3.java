package Text.Chap03;

import java.util.Scanner;

public class Max3 {
  public static void main(String[] main) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数a：");
    int a = stdIn.nextInt();
    System.out.print("整数b：");
    int b = stdIn.nextInt();
    System.out.print("整数c：");
    int c = stdIn.nextInt();

    int max = a;
    if (b > max)
      max = b;
    if (c > max)
      max = c;
    System.out.println("最大値は" + max + "です。");
    stdIn.close();
  }
}
