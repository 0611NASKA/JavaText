package Text.Chap10;

class MinMax {

  public static double getMx3(double x, double y, double z) {
    double M = Math.max(x, y);
    double Max = Math.max(M, z);
    return Max;
  }

  public static double getMn3(double x, double y, double z) {
    double m = Math.min(x, y);
    double min = Math.min(m, z);
    return min;
  }

  public static double getMx2(double x, double y) {
    double M = Math.max(x, y);
    return M;
  }

  public static double getMn2(double x, double y) {
    double m = Math.min(x, y);
    return m;
  }

  public static double getMxMat(double[] a) {
    double max = a[0];
    for (int i = 0; i < a.length; i++)
      max = Math.max(max, a[i]);
    return max;
  }

  public static double getMnMat(double[] a) {
    double min = a[0];
    for (int i = 0; i < a.length; i++)
      min = Math.min(min, a[i]);
    return min;
  }
}
