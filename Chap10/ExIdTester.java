package Text.Chap10;

class ExId {
  static int counter = 0;

  private int id;
  static int n = 1;

  static void changeN(int i) {
    n = i;
  }

  public ExId() {
    counter += n;
    id = counter;
  }

  public int getExId() {
    return id;
  }

  static int getMaxExId() {
    return counter;
  }
}

public class ExIdTester {

  public static void main(String[] args) {

    ExId a = new ExId();
    ExId b = new ExId();
    ExId.changeN(4);
    ExId c = new ExId();
    ExId d = new ExId();

    System.out.println("aの識別番号: " + a.getExId());
    System.out.println("bの識別番号: " + b.getExId());
    System.out.println("cの識別番号: " + c.getExId());
    System.out.println("dの識別番号: " + d.getExId());

    System.out.println("Id.counter = " + ExId.counter);
    System.out.println("a.counter = " + a.counter);
    System.out.println("b.counter = " + b.counter);
    System.out.println("c.counter = " + c.counter);
    System.out.println("d.counter = " + d.counter);
    System.out.println("MaxId = " + ExId.getMaxExId());
  }
}
