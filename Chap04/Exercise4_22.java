package Text.Chap04;

import java.util.Scanner;

public class Exercise4_22 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーにnの値を入力するように促す
    System.out.print("ピラミッドの段数を入力してください：");
    // ユーザーからの入力を整数として受け取り、pyramidSizeという変数に格納
    int pyramidSize = scanner.nextInt();

    // 外側のループはピラミッドの段数を制御
    for (int i = 0; i < pyramidSize; i++) {
      // 内側のループは各段の空白の数を制御
      for (int j = pyramidSize - i; j > 1; j--) {
        System.out.print(" ");
      }
      // 内側のループは各段の'*'の数を制御
      for (int k = 0; k <= (i * 2); k++) {
        System.out.print("*");
      }
      // 各段の最後で改行
      System.out.println();
    }
  }
}
