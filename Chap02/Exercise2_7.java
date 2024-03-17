package Text.Chap02;

import java.util.Random;

public class Exercise2_7 {
  public static void main(String[] args) {
    Random rand = new Random();

    int plus = rand.nextInt(9) + 1;
    int minus = (rand.nextInt(9) + 1) * -1;
    int plus2 = rand.nextInt(90) + 10;

    System.out.println("1桁の正の整数値は" + plus + "です。");
    System.out.println("1桁の負の整数値は" + minus + "です。");
    System.out.println("2桁の正の整数値は" + plus2 + "です。");
  }
}
