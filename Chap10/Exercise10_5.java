package Text.Chap10;

public class Exercise10_5 {
  public static void main(String[] args) {
    Account my = new Account("swaponQ", "123456", 100000);

    System.out.println("　口座名義：" + my.getName());
    System.out.println("　口座番号：" + my.getNo());
    System.out.println("　預金残高：" + my.getBalance());

  }
}
