package Text.Chap09;

public class Day {
  // 年を表すフィールド（初期値は1）
  private int year = 1;
  // 月を表すフィールド（初期値は1）
  private int month = 1;
  // 日を表すフィールド（初期値は1）
  private int date = 1;

  // デフォルトコンストラクタ
  public Day() {
  }

  // 年を指定するコンストラクタ
  public Day(int year) {
    this.year = year;
  }

  // 年と月を指定するコンストラクタ
  public Day(int year, int month) {
    this(year);
    this.month = month;
  }

  // 年、月、日を指定するコンストラクタ
  public Day(int year, int month, int date) {
    this(year, month);
    this.date = date;
  }

  // 他のDayオブジェクトを受け取るコンストラクタ
  public Day(Day d) {
    this(d.year, d.month, d.date);
  }

  // 年を取得するメソッド
  public int getYear() {
    return year;
  }

  // 月を取得するメソッド
  public int getMonth() {
    return month;
  }

  // 日を取得するメソッド
  public int getDate() {
    return date;
  }

  // 年を設定するメソッド
  public void setYear(int year) {
    this.year = year;
  }

  // 月を設定するメソッド
  public void setMonth(int month) {
    this.month = month;
  }

  // 日を設定するメソッド
  public void setDate(int date) {
    this.date = date;
  }

  // 年、月、日を設定するメソッド
  public void set(int year, int month, int date) {
    this.year = year;
    this.month = month;
    this.date = date;
  }

  // 曜日を計算するメソッド
  public int dayOfWeek() {
    int y = year;
    int m = month;
    if (m == 1 || m == 2) {
      y--;
      m += 12;
    }
    return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
  }

  // 他のDayオブジェクトと等しいかを判定するメソッド
  public boolean equalTo(Day d) {
    return year == d.year && month == d.month && date == d.date;
  }

  // オブジェクトの文字列表現を返すメソッド
  public String toString() {
    String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
    return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
  }
}