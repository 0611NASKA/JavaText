package Text.Chap02;

import java.util.Random;

public class Exercise2_9 {
  public static void main(String[] args) {
    Random rd = new Random();

    double db1 = rd.nextDouble();
    double db2 = rd.nextDouble(10);
    double db3 = rd.nextDouble();
    int num = rd.nextInt(2);
    db3 = db3 - num;

    System.out.println("0.0以上1.0未満の実数値：" + db1 + "です。");
    System.out.println("0.0以上10.0未満の実数値：" + db2 + "です。");
    System.out.println("-1.0以上1.0未満の実数値：" + db3 + "です。");
  }
}