package Text.Chap05;

import java.util.Scanner;

public class Exercise5_4 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーに三つの整数を入力するように促す
    System.out.print("整数1を入力してください：");
    int number1 = scanner.nextInt();
    System.out.print("整数2を入力してください：");
    int number2 = scanner.nextInt();
    System.out.print("整数3を入力してください：");
    int number3 = scanner.nextInt();

    // 三つの整数の合計を計算
    int sum = number1 + number2 + number3;

    // 三つの整数の平均を計算（実数として）
    double average = (double) sum / 3;

    // 合計と平均を表示
    System.out.println("合計は" + sum + "です。");
    System.out.println("平均は" + average + "です。");
  }
}
