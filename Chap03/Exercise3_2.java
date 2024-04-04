package Text.Chap03;

// Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise3_2
 * 概要:約数の判別を行うメソッド
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_2 {
  /*
   * 関数名:main
   * 概要:約数の判別を行うメソッド
   * 引数:なし
   * 戻り値:なし
   * 作成者:N.Hagiwara
   * 作成日:2024/04/02
   */
  public static void main(String[] args) {
    // scannerクラスの変数を定義
    Scanner standardInput = new Scanner(System.in);

    // 文字列を改行なしで出力
    System.out.print("整数A：");
    // 整数Aの値をコンソールで受け付け
    int a = standardInput.nextInt();

    // 文字列を改行なしで出力
    System.out.print("整数B：");
    // 整数Bの値をコンソールで受け付け
    int b = standardInput.nextInt();
    // b が0の時
    if (b == 0) {
      // 文字列を改行ありで出力
      System.out.println("Bが0では約数を求めることができません");
      // a/bの余りが0の時
    } else if (a % b == 0) {// 修正
      // 文字列を改行ありで出力
      System.out.println("BはAの約数です。");
      // それ以外の時
    } else {
      // 文字列を改行ありで出力
      System.out.println("BはAの約数ではありません。");
    }
    // scannerの受付を終了
    standardInput.close();
  }
  // 正の整数値の入力を前提としているため負は考えない
}
