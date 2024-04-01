package Text.Chap05;

import java.util.Scanner;

public class Exercise5_1 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーに10進整数を入力するように促す
    System.out.print("10進整数を入力してください：");
    // ユーザーからの入力を整数として受け取り、decimalNumberという変数に格納
    int decimalNumber = scanner.nextInt();

    // 10進整数を8進数に変換し、表示
    String octalNumber = Integer.toOctalString(decimalNumber);
    System.out.println("8進数では " + octalNumber + " です。");

    // 10進整数を16進数に変換し、表示
    String hexadecimalNumber = Integer.toHexString(decimalNumber);
    System.out.println("16進数では " + hexadecimalNumber + " です。");
  }
}
