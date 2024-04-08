package Text.Chap07;

public class Exercise7_32 {
  // byte型の数値のビット構成を表示するためのメソッド。これにより、byte型の数値の内部表現を理解しやすくする。
  static void printBits(byte x) {
    for (int i = 31; i >= 0; i--) // 32ビット全てを順に調べる。これにより、byte型の数値の全てのビットを確認できる。
      System.out.print(((x >>> i & 1) == 1) ? '1' : '0'); // 各ビットが1か0かを判定し、その結果を出力する。これにより、ビット構成が表示される。
    System.out.printf("\nbyte型\n"); // ビット構成の表示が終わったことを示すための改行とメッセージ。
  }

  // short型の数値のビット構成を表示するためのメソッド。これにより、short型の数値の内部表現を理解しやすくする。
  static void printBits(short x) {
    for (int i = 31; i >= 0; i--) // 32ビット全てを順に調べる。これにより、short型の数値の全てのビットを確認できる。
      System.out.print(((x >>> i & 1) == 1) ? '1' : '0'); // 各ビットが1か0かを判定し、その結果を出力する。これにより、ビット構成が表示される。
    System.out.printf("\nshort型\n"); // ビット構成の表示が終わったことを示すための改行とメッセージ。
  }

  // int型の数値のビット構成を表示するためのメソッド。これにより、int型の数値の内部表現を理解しやすくする。
  static void printBits(int x) {
    for (int i = 31; i >= 0; i--) // 32ビット全てを順に調べる。これにより、int型の数値の全てのビットを確認できる。
      System.out.print(((x >>> i & 1) == 1) ? '1' : '0'); // 各ビットが1か0かを判定し、その結果を出力する。これにより、ビット構成が表示される。
    System.out.printf("\nint型\n"); // ビット構成の表示が終わったことを示すための改行とメッセージ。
  }

  // long型の数値のビット構成を表示するためのメソッド。これにより、long型の数値の内部表現を理解しやすくする。
  static void printBits(long x) {
    for (int i = 31; i >= 0; i--) // 32ビット全てを順に調べる。これにより、long型の数値の全てのビットを確認できる。
      System.out.print(((x >>> i & 1) == 1) ? '1' : '0'); // 各ビットが1か0かを判定し、その結果を出力する。これにより、ビット構成が表示される。
    System.out.printf("\nlong型\n"); // ビット構成の表示が終わったことを示すための改行とメッセージ。
  }

  public static void main(String[] args) {
    int a = 7; // int型の数値を定義。これは、ビット構成を表示する対象となる。
    printBits(a); // aのビット構成を表示する。これにより、aの内部表現を確認できる。
  }
}
