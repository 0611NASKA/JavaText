package Text.Chap08;

import java.util.Scanner;

public class Exercise8_2 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    // Carオブジェクトを生成することで、車の情報を管理できるようにする
    Car myCar = new Car("Vitz", 1660, 1500, 3640, 100.0, 12.0);
    // 車の詳細情報を表示することで、ユーザーに車の状態を知らせる
    myCar.putSpec();
    while (true) {
      // 現在の車の位置と残り燃料を表示することで、ユーザーに車の状態を知らせる
      System.out.printf("現在地：(%f, %f)\n残り燃料：%f\n", myCar.getX(), myCar.getY(), myCar.getFuel());
      // ユーザーに移動の意思を確認することで、インタラクティブな操作を可能にする
      System.out.print("移動しますか[0…No／1…Yes]：");
      if (stdIn.nextInt() == 0)
        break;

      // ユーザーに移動距離を入力させることで、自由な移動を可能にする
      System.out.print("x方向の移動距離：");
      double dx = stdIn.nextDouble();
      System.out.print("y方向の移動距離：");
      double dy = stdIn.nextDouble();

      // 移動の成否を判定することで、燃料不足によるエラーを防ぐ
      if (!myCar.move(dx, dy)) {
        System.out.println("燃料が足りません！");
        // ユーザーに給油の意思を確認することで、燃料切れによるゲームオーバーを回避する
        System.out.print("給油しますか[0…No／1…Yes]：");
        if (stdIn.nextInt() == 0) {
          break;
        } else {
          // ユーザーに給油量を入力させることで、柔軟な燃料管理を可能にする
          System.out.print("給油量：");
          double charge = stdIn.nextDouble();
          myCar.chargeFuel(charge);
        }
      }
    }
  }
}
