package Text.Chap07;

public class Exercise7_31 {
  // int型の数値の絶対値を求めるためのメソッド。これにより、int型の数値の正負を問わずにその大きさを比較できる。
  static int absolute(int x) {
    if (x < 0)
      x = -x; // xが負の場合、その符号を反転させる。これにより、xの絶対値が求まる。
    return x; // 絶対値を返す。これにより、このメソッドを呼び出したコードは絶対値を取得できる。
  }

  // long型の数値の絶対値を求めるためのメソッド。これにより、long型の数値の正負を問わずにその大きさを比較できる。
  static long absolute(long x) {
    if (x < 0)
      x = -x; // xが負の場合、その符号を反転させる。これにより、xの絶対値が求まる。
    return x; // 絶対値を返す。これにより、このメソッドを呼び出したコードは絶対値を取得できる。
  }

  // float型の数値の絶対値を求めるためのメソッド。これにより、float型の数値の正負を問わずにその大きさを比較できる。
  static float absolute(float x) {
    if (x < 0)
      x = -x; // xが負の場合、その符号を反転させる。これにより、xの絶対値が求まる。
    return x; // 絶対値を返す。これにより、このメソッドを呼び出したコードは絶対値を取得できる。
  }

  // double型の数値の絶対値を求めるためのメソッド。これにより、double型の数値の正負を問わずにその大きさを比較できる。
  static double absolute(double x) {
    if (x < 0)
      x = -x; // xが負の場合、その符号を反転させる。これにより、xの絶対値が求まる。
    return x; // 絶対値を返す。これにより、このメソッドを呼び出したコードは絶対値を取得できる。
  }

  public static void main(String[] args) {
    int i = 3;
    long l = -7;
    float f = 0;
    double d = -5.21; // それぞれ異なる型の数値を定義。これらは、絶対値を求める対象となる。
    // int型の数値の絶対値を求め、結果を出力する。これにより、int型の数値の絶対値を確認できる。
    System.out.println("int型の絶対値:" + absolute(i));
    // long型の数値の絶対値を求め、結果を出力する。これにより、long型の数値の絶対値を確認できる。
    System.out.println("long型の絶対値:" + absolute(l));
    // float型の数値の絶対値を求め、結果を出力する。これにより、float型の数値の絶対値を確認できる。
    System.out.println("float型の絶対値:" + absolute(f));
    // double型の数値の絶対値を求め、結果を出力する。これにより、double型の数値の絶対値を確認できる。
    System.out.println("double型の絶対値:" + absolute(d));
  }
}
