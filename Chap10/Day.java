package Text.Chap10;

public class Day {
  static GregorianCalendar today = new GregorianCalendar();
  private int year = today.get(YEAR);
  private int month = today.get(MONTH) + 1;
  private int date = today.get(DATE);

  public static boolean isLeap(int y) {
    return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
  }

  public Day() {
  }

  public Day(int year) {
    if (year < 1)
      this.year = 1;
    else
      this.year = year;
  }

  public Day(int year, int month) {
    this(year);
    if (month > 12)
      this.month = 12;
    else if (month < 1)
      this.month = 1;
    else
      this.month = month;
  }

  public Day(int year, int month, int date) {
    this(year, month);
    if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 31)
      this.date = 31;
    else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30)
      this.date = 30;
    else if (month == 2 && isLeap(year) == true && date > 29)
      this.date = 29;
    else if (month == 2 && isLeap(year) == false && date > 28)
      this.date = 28;
    else if (date < 1)
      this.date = 1;
    else
      this.date = date;
  }

  public Day(Day d) {
    this(d.year, d.month, d.date);
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return date;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setDate(int date) {
    this.date = date;
  }

  public void set(int year, int month, int date) {
    this.year = year;
    this.month = month;
    this.date = date;
  }

  public boolean isLeap() {
    return isLeap(year);
  }

  public int dayOfWeek() {
    int y = year;
    int m = month;
    if (m == 1 || m == 2) {
      y--;
      m += 12;
    }
    return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
  }

  public int daysPast() {
    int r = 0;
    int y = year;
    int m = month;
    int d = date;
    if (m == 1)
      r = d;
    else if (m == 2)
      r = d + 31;
    else if (m == 3)
      r = d + 60;
    else if (m == 4)
      r = d + 91;
    else if (m == 5)
      r = d + 121;
    else if (m == 6)
      r = d + 152;
    else if (m == 7)
      r = d + 182;
    else if (m == 8)
      r = d + 213;
    else if (m == 9)
      r = d + 244;
    else if (m == 10)
      r = d + 274;
    else if (m == 11)
      r = d + 305;
    else
      r = d + 335;
    if (isLeap(y) == false)
      r--;
    return r;
  }

  public String toString() {
    String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
    return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
  }
}
