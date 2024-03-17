package Text.Chap02;

import java.util.Random;

public class LuckyNo {
  public static void main(String[] args) {
    Random rand = new Random();

    int lucky = rand.nextInt(10);

    System.out.println("今日のラッキーナンバーは" + lucky + "です。");
  }
}
