package Text.Chap04;

import java.util.Scanner;

public class Exercise4_21 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーにnの値を入力するように促す
    System.out.print("三角形の大きさを入力してください：");
    // ユーザーからの入力を整数として受け取り、triangleSizeという変数に格納
    int triangleSize = scanner.nextInt();

    // 直角が左上側の三角形を描画
    for (int i = 0; i < triangleSize; i++) {
      for (int j = triangleSize - i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }

    // 直角が右下側の三角形を描画
    for (int i = 0; i < triangleSize; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = triangleSize - i; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }

    // 直角が右上側の三角形を描画
    for (int i = 0; i < triangleSize; i++) {
      for (int j = 0; j < triangleSize - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
