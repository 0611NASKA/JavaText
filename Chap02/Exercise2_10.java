package Text.Chap02;

import java.util.Scanner;

public class Exercise2_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("姓：");
    String last = sc.next();

    System.out.print("名：");
    String first = sc.next();

    System.out.println("こんにちは" + last + first + "さん。");
    sc.close();
  }
}
