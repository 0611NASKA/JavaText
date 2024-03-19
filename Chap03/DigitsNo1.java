package Text.Chap03;

import java.util.Scanner;

public class DigitsNo1 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数値：");
    int n = stdIn.nextInt();

    if (n == 0)
      System.out.println("ゼロです。");
    else if (n >= -9 && n <= 9)
      System.out.println("1桁です。");
    else
      System.out.println("2桁以上です。");
    stdIn.close();
  }
}
