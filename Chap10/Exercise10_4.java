package Text.Chap10;

public class Exercise10_4 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    Day t = new Day();
    System.out.println(t.toString());
    System.out.println(t.getYear() + "年は閏年" + (t.isLeap() ? "です" : "ではありません"));
    System.out.println(t.toString() + "は" + t.getYear() + "年の1月1日から" + t.daysPast() + "日です。");

    int y, m, d;
    System.out.print("年:");
    y = stdIn.nextInt();
    System.out.print("月:");
    m = stdIn.nextInt();
    System.out.print("日:");
    d = stdIn.nextInt();

    Day a = new Day(y, m, d);
    System.out.println(a.toString());
    System.out.println(a.getYear() + "年は閏年" + (a.isLeap() ? "です" : "ではありません"));
    System.out.println(a.toString() + "は" + a.getYear() + "年の1月1日から" + a.daysPast() + "日です。");
  }
}
