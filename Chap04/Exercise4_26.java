package Text.Chap04;

import java.util.Scanner;

public class Exercise4_26 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーに整数の個数を入力するように促す
    System.out.println("整数を加算します。");
    System.out.print("何個加算しますか：");
    // ユーザーからの入力を整数として受け取り、numberOfIntegersという変数に格納
    int numberOfIntegers = scanner.nextInt();

    // 合計と平均を計算するための変数を初期化
    int sum = 0;
    int count = 0;

    // numberOfIntegers回だけループを実行
    for (int i = 0; i < numberOfIntegers; i++) {
      System.out.print("整数：");
      // ユーザーからの入力を整数として受け取り、inputIntegerという変数に格納
      int inputInteger = scanner.nextInt();
      // inputIntegerが負の数の場合、加算せずに次のループに進む
      if (inputInteger < 0) {
        System.out.println("負の数は加算しません。");
        continue;
      }
      // 合計に入力値を加算
      sum += inputInteger;
      // 入力値の数をカウント
      count++;
    }
    // 平均を計算
    double average = (double) sum / count;

    // 合計と平均を出力
    System.out.println("合計は" + sum + "です。");
    System.out.println("平均は" + average + "です。");
  }
}
