package Text.Chap09;

class Account {
  private String name; // 口座名義
  private String no; // 口座番号
  private long balance; // 預金残高
  private Day day; // 口座開設日

  // --- コンストラクタ ---//
  Account(String n, String num, long z, Day d) {
    name = n; // 口座名義
    no = num; // 口座番号
    balance = z; // 預金残高
    day = new Day(d); // 口座開設日
  }

  // --- 口座名義を調べる ---//
  String getName() {
    return name;
  }

  // --- 口座番号を調べる ---//
  String getNo() {
    return no;
  }

  // --- 預金残高を調べる ---//
  long getBalance() {
    return balance;
  }

  // --- 口座開設日を調べる ---//
  public Day getDay() {
    return new Day(day);
  }

  // --- k円預ける ---//
  void deposit(long k) {
    balance += k;
  }

  // --- k円おろす ---//
  void withdraw(long k) {
    balance -= k;
  }

  // --- 文字列表現を返却 ---//
  public String toString() {
    return String.format("口座名義：%s\n口座番号：%s\n預金残高：%d\n口座開設日：%s\n", name, no, balance, day);
  }
}
