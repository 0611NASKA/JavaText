package Text.Chap04;

import java.util.Scanner;

public class Exercise4_19 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // 再試行するかどうかを制御する変数retryを定義
    int retry;

    // do-whileループを開始
    do {
      // ユーザーに月を入力するように促す
      System.out.print("季節を求めます。\n何月ですか？");
      // ユーザーからの入力を整数として受け取り、monthという変数に格納
      int month = scanner.nextInt();

      // monthが1~12の範囲外なら再入力させる
      while (month < 1 || month > 12) {
        System.out.print("1~12の間で入力してください。何月ですか？");
        month = scanner.nextInt();
      }

      // monthの値に応じて季節を出力
      if (month >= 3 && month <= 5)
        System.out.println("それは春です。");
      else if (month >= 6 && month <= 8)
        System.out.println("それは夏です。");
      else if (month >= 9 && month <= 11)
        System.out.println("それは秋です。");
      else if (month == 12 || month == 1 || month == 2)
        System.out.println("それは冬です。");

      // ユーザーに再試行するかどうかを尋ねる
      System.out.print("もう一度？ 1・・・Yes / 0・・・No:");
      // ユーザーからの入力を整数として受け取り、retryという変数に格納
      retry = scanner.nextInt();
      // retryの値が1ならループを続ける
    } while (retry == 1);
  }
}
