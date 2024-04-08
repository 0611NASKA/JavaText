package Text.Chap07;

import java.util.Scanner;

public class Exercise7_29 {
  // 2次元配列を複製するためのメソッド。元の配列を変更しても複製された配列に影響を与えないようにする。
  static int[][] aryClone2(int[][] a) {
    int[][] ans = new int[a.length][a[0].length]; // 元の配列と同じサイズの新しい配列を作成。これにより、元の配列とは独立した新しい配列が作成される。
    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans[i].length; j++) {
        ans[i][j] = a[i][j]; // 元の配列の各要素を新しい配列にコピー。これにより、元の配列の内容が新しい配列に複製される。
      }
    }
    return ans; // 複製された新しい配列を返す。これにより、このメソッドを呼び出したコードは元の配列とは独立した新しい配列を取得できる。
  }

  // 2次元配列を視覚的に理解しやすい形で出力するためのメソッド。これにより、配列の内容を一目で確認できる。
  static void printMatrix(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j] + "  "); // 配列の各要素を出力。これにより、配列の内容が一行に表示される。
      }
      System.out.println(); // 配列の各行を改行する。これにより、2次元配列が行列の形で出力される。
    }
  }

  public static void main(String[] args) {
    int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2次元配列を作成。これは、このプログラムが操作するデータの一部である。
    int[][] b = aryClone2(a); // 配列aを複製し、その結果を配列bに格納。これにより、配列aとは独立した新しい配列が作成される。
    System.out.println("行列a");
    printMatrix(a); // 配列aを出力。これにより、配列aの内容を確認できる。
    System.out.println("行列b");
    printMatrix(b); // 配列bを出力。これにより、配列b（配列aの複製）の内容を確認できる。
  }
}