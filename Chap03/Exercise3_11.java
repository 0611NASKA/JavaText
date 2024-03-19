package Text.Chap03;

import java.util.Scanner;

public class Exercise3_11 {
  public static void main(String[] main) {
    Scanner sc = new Scanner(System.in);

    System.out.print("整数A：");
    int a = sc.nextInt();
    System.out.print("整数B：");
    int b = sc.nextInt();

    int n = a > b ? a - b : b - a;

    if (n <= 10) {
      System.out.println("それらの差は10以下です。");
    } else {
      System.out.println("それらの差は11以上です。");
    }
    sc.close();
  }
}
