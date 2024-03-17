package Text.Chap02;

import java.util.Scanner;

public class Circle1 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("半径:");
    double r = stdIn.nextDouble();

    System.out.println("円周の長さは" + 2 * 3.14 * r + "です。");
    System.out.println("面積は" + 3.14 * r * r + "です。");
  }
}
