package Text.Chap04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_7 {
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーに何個の記号文字を表示するか尋ねる
    System.out.print("何個*を表示しますか：");

    // ユーザーからの入力を読み取る
    int numberOfSymbols = scanner.nextInt();

    // カウンタ変数を初期化
    int counter = 0;

    // カウンタがnumberOfSymbolsより小さい間、ループ
    while (counter < numberOfSymbols) {
      // 記号文字を表示
      System.out.print('*');

      // カウンタをインクリメント
      counter++;
    }

    // 改行
    System.out.println();
    // scannerの受付を終了
    scanner.close();
  }
}
