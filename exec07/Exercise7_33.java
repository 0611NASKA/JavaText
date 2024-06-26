package Text.exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
* クラス名:Exercise7_33
* 概要:一次元配列と二次元配列の全要素の値を表示する
* 作成者:N.Hagiwara
* 作成日:2024/04/09
*/
public class Exercise7_33 {
  /*
   * 関数名:printArray
   * 概要:一次元配列の全要素の値を出力
   * 引数:int型の一次元配列a
   * 戻り値:なし
   * 作成者:N.Hagiwara
   * 作成日:2024/04/09
   */
  public static void printArray(int[] a) {
    // 配列の全ての要素を順に調べる
    for (int i = 0; i < a.length; i++) {
      // 各要素を出力し、要素間に1文字分のスペースを空ける
      System.out.print(a[i] + " ");
    }
    // 配列の表示が終わったことを示すための改行
    System.out.println();
  }

  /*
   * 関数名:findMax
   * 概要:2次元配列の最大値を求める
   * 引数:int型の二次元配列a
   * 戻り値:最大値
   * 作成者:N.Hagiwara
   * 作成日:2024/04/09
   */
  public static int findMax(int[][] integerArray) {
    // 配列の最初の要素を最大値とする
    int maximumValue = integerArray[0][0];
    // 配列の全ての行を順に調べる
    for (int i = 0; i < integerArray.length; i++) {
      // 各行の全ての要素を順に調べる
      for (int j = 0; j < integerArray[i].length; j++) {
        // 現在の要素が現在の最大値より大きい場合
        if (integerArray[i][j] > maximumValue) {
          // 最大値の値を変更する
          maximumValue = integerArray[i][j];
        }
      }
    }
    // 最大値を返す
    return maximumValue;
  }

  /*
   * 関数名:printArray
   * 概要:二次元配列の全要素の値を出力
   * 引数:int型の二次元配列a
   * 戻り値:なし
   * 作成者:N.Hagiwara
   * 作成日:2024/04/09
   */
  public static void printArray(int[][] a) {
    // 各列の最大値を格納する配列を初期化
    int[] columnMax = new int[a[0].length];
    // 配列のすべての行を順に調べる
    for (int i = 0; i < a.length; i++) {
      // 各行の全ての要素を順に調べる
      for (int j = 0; j < a[i].length; j++) {
        // 現在の要素が現在の列の最大値より大きい場合
        if (a[i][j] > columnMax[j]) {
          // 最大値の値を変更する
          columnMax[j] = a[i][j];
        }
      }
    }

    // 各要素の最大桁数を求める
    int[] maxDigits = new int[a[0].length];
    // 各列の最大値の桁数を求める
    for (int i = 0; i < a.length; i++) {
      // 各行の全ての要素を順に調べる
      for (int j = 0; j < a[i].length; j++) {
        // 各要素の桁数を求める
        int digits = String.valueOf(a[i][j]).length();
        // 現在の桁数が現在の列の最大桁数より大きい場合
        if (digits > maxDigits[j]) {
          // 最大桁数の値を変更する
          maxDigits[j] = digits;
        }
      }
    }

    // 各列の最大桁数に合わせて出力する
    for (int i = 0; i < a.length; i++) {
      // 各行の全ての要素を順に調べる
      for (int j = 0; j < a[i].length; j++) {
        // 各要素の桁数に合わせて出力する
        String formatSetting = "%-" + maxDigits[j] + "d ";
        // 各要素を出力する
        System.out.printf(formatSetting, a[i][j]);
      }
      // 改行する
      System.out.println();
    }
  }

  /*
   * 関数名:main
   * 概要:一次元配列と二次元配列の全要素の値を表示する
   * 引数:なし
   * 戻り値:なし
   * 作成者:N.Hagiwara
   * 作成日:2024/04/09
   */
  public static void main(String[] args) {
    // ユーザーからの入力を受け取るためのScannerオブジェクトを作成
    Scanner standardInput = new Scanner(System.in);
    // ユーザーに1次元配列の要素数の入力を促す
    System.out.print("1次元配列の要素数を入力してください: ");
    // ユーザーから入力された要素数を取得
    int integerNumber = standardInput.nextInt();

    // 要素数が0以下の場合
    if (integerNumber <= 0) {
      // 後判定ループ文
      do {
        // ユーザーに各行の列数の入力を促す
        System.out.print("要素数は正の整数値で入力してください: ");
        // ユーザーから入力された列数を取得
        integerNumber = standardInput.nextInt();
        // 正の整数値が入力されたら抜け出す
      } while (integerNumber <= 0);
    }

    // 入力された要素数で1次元配列を作成
    int[] integerArray = new int[integerNumber];
    // ユーザーに1次元配列の要素の入力を促す
    System.out.println("1次元配列の要素を入力してください:");
    // 要素数分繰り返し
    for (int i = 0; i < integerNumber; i++) {
      // ユーザーから入力された各要素を配列に格納
      integerArray[i] = standardInput.nextInt();
    }
    // 配列の全要素を表示
    printArray(integerArray);

    // ユーザーに2次元配列の行数の入力を促す
    System.out.print("2次元配列の行数を入力してください: ");
    // ユーザーから入力された行数を取得
    int arrayRows = standardInput.nextInt();
    // 行が0以下の場合
    if (arrayRows <= 0) {
      // 後判定ループ文
      do {
        // ユーザーに各行の行数の入力を促す
        System.out.print("行は正の整数値で入力してください: ");
        // ユーザーから入力された列数を取得
        arrayRows = standardInput.nextInt();
        // 正の整数値が入力されたら抜け出す
      } while (arrayRows <= 0);
    }

    // 入力された行数で2次元配列を作成
    int[][] twoDimensionalArray = new int[arrayRows][];

    // 行数分繰り返し
    for (int i = 0; i < arrayRows; i++) {
      // ユーザーに各行の列数の入力を促す
      System.out.print("行" + (i + 1) + "の列数を入力してください: ");
      // ユーザーから入力された列数を取得
      int arrayCols = standardInput.nextInt();

      // 列が0以下の場合
      if (arrayCols <= 0) {
        // 後判定ループ文
        do {
          // ユーザーに各行の列数の入力を促す
          System.out.print("列は正の整数値で入力してください: ");
          // ユーザーから入力された列数を取得
          arrayCols = standardInput.nextInt();
          // 正の整数値が入力されたら抜け出す
        } while (arrayCols <= 0);
      }

      // 入力された列数で各行の配列を作成
      twoDimensionalArray[i] = new int[arrayCols];
      // ユーザーに各行の要素の入力を促す
      System.out.println("行" + (i + 1) + "の要素を入力してください:");

      // 列数分繰り返す
      for (int j = 0; j < arrayCols; j++) {
        // ユーザーから入力された各要素を配列に格納
        twoDimensionalArray[i][j] = standardInput.nextInt();
      }
    }

    // 二次元配列の全要素を表示する
    printArray(twoDimensionalArray);
    // Scannerオブジェクトを閉じる
    standardInput.close();

  }

}
