package Text.Chap04;

import java.util.Scanner;

public class Exercise4_20 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーにnの値を入力するように促す
    System.out.print("正方形の段数を入力してください：");
    // ユーザーからの入力を整数として受け取り、squareSizeという変数に格納
    int squareSize = scanner.nextInt();

    // 外側のループは正方形の段数を制御
    for (int i = 0; i < squareSize; i++) {
      // 内側のループは各段の'*'の数を制御
      for (int j = 0; j < squareSize; j++) {
        // '*'を出力
        System.out.print("*");
      }
      // 各段の最後で改行
      System.out.println();
    }
  }
}
