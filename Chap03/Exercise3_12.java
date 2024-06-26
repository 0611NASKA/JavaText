package Text.Chap03;

// Scannerライブラリの呼び出し
import java.util.Scanner;

/*
 * クラス名:Exercise3_12
 * 概要:三つの整数値の最小値を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_12 {
  /*
   * 関数名:main
   * 概要:三つの整数値の最小値を求める
   * 引数:なし
   * 戻り値:なし
   * 作成者:N.Hagiwara
   * 作成日:2024/04/01
   */
  public static void main(String[] main) {
    // Scannerクラスの変数を定義
    Scanner standardInput = new Scanner(System.in);

    // 文字列を改行なしで出力
    System.out.print("一つ目の整数：");
    // 一つ目の整数の値をコンソールで受け付け
    int firstNumber = standardInput.nextInt();
    // 文字列を改行なしで出力
    System.out.print("二つ目の整数：");
    // 二つ目の整数の値をコンソールで受け付け
    int secondNumber = standardInput.nextInt();
    // 文字列を改行なしで出力
    System.out.print("三つ目の整数：");
    // 三つ目の整数の値をコンソールで受け付け
    int thirdNumber = standardInput.nextInt();

    // 最小値に最初の整数を代入
    int minimumValue = firstNumber;
    // 最小値よりも二つ目の整数が小さいとき
    if (secondNumber < minimumValue) {
      // 最小値に二つ目の整数を代入
      minimumValue = secondNumber;
    }
    // 最小値よりも三つ目の整数が小さいとき
    if (thirdNumber < minimumValue) {
      // 最小値に三つ目の整数を代入
      minimumValue = thirdNumber;
    }
    // 最小値を出力
    System.out.println("最小値は" + minimumValue + "です。");
    // standardInputの受付を終了
    standardInput.close();
  }
}
