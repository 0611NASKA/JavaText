package Text.Chap09;

public class Period {
  private Day from; // 開始日
  private Day to; // 終了日

  public Period(Day from, Day to) {
    this.from = new Day(from);
    this.to = new Day(to);
  }

  public Day getFrom() {
    return new Day(from);
  }

  public Day getTo() {
    return new Day(to);
  }

  public void putSpec() {
    System.out.println("開始日:" + from);
    System.out.println("終了日:" + to);
  }
}
