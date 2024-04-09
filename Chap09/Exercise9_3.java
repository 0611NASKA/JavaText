package Text.Chap09;

public class Exercise9_3 {
  public static void main(String[] args) {
    Account my = new Account("swaponQ", "123456", 100000, new Day(2020, 8, 4));
    System.out.print(my.toString());
  }
}
