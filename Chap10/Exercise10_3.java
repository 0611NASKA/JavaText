package Text.Chap10;

public class Exercise10_3 {
  public static void main(String[] args) {

    Scanner stdIn = new Scanner(System.in);

    System.out.print("二値...1/三値...2/配列...3:");
    int choice = stdIn.nextInt();

    if (choice == 1) {
      System.out.print("xの値:");
      double x = stdIn.nextDouble();
      System.out.print("yの値:");
      double y = stdIn.nextDouble();
      System.out.println("最大値は" + MinMax.getMx2(x, y) + "です。");
      System.out.println("最小値は" + MinMax.getMn2(x, y) + "です。");
    } else if (choice == 2) {
      System.out.print("xの値:");
      double x = stdIn.nextDouble();
      System.out.print("yの値:");
      double y = stdIn.nextDouble();
      System.out.print("zの値:");
      double z = stdIn.nextDouble();
      System.out.println("最大値は" + MinMax.getMx3(x, y, z) + "です。");
      System.out.println("最小値は" + MinMax.getMn3(x, y, z) + "です。");
    } else if (choice == 3) {
      System.out.print("配列数:");
      int n = stdIn.nextInt();
      double[] a = new double[n];
      System.out.println("配列数" + n + "の数の大小を求めます。");
      for (int i = 0; i < n; i++) {
        System.out.print("a[" + i + "]:");
        a[i] = stdIn.nextDouble();
      }
      System.out.println("最大値は" + MinMax.getMxMat(a) + "です。");
      System.out.println("最小値は" + MinMax.getMnMat(a) + "です。");
    }
  }
}
