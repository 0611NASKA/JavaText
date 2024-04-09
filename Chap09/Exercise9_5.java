package Text.Chap09;

public class Exercise9_5 {
  public static void main(String[] args) {
    Day from = new Day(2000, 1, 1);
    Day to = new Day(2020, 8, 4);
    Period p = new Period(from, to);
    p.putSpec();
  }
}
