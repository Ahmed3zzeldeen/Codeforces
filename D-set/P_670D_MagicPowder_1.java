import java.util.Scanner;

public class P_670D_MagicPowder_1 {

  static int k;
  static int[] weNeed;
  static int[] weHave;

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int n = input.nextInt();
      k = input.nextInt();
      weNeed = new int[n];
      weHave = new int[n];
      for (int i = 0; i < weNeed.length; i++) {
        weNeed[i] = input.nextInt();
      }
      for (int i = 0; i < weHave.length; i++) {
        weHave[i] = input.nextInt();
      }
    }
    System.out.println(BSfindFirst(0, 100005));

  }

  public static boolean iCanCook(long x) {
    long kNeeded = 0;
    for (int i = 0; i < weNeed.length; i++) {
      if (weNeed[i] * x > weHave[i]) {
        kNeeded += weNeed[i] * x - weHave[i];
      }
    }
    return (k >= kNeeded);
  }

  public static int BSfindFirst(int start, int end) {
    while (start < end) {
      int mid = start + (end - start + 1) / 2;
      if (iCanCook(mid)) {
        start = mid;
      } else {
        end = mid - 1;
      }
    }
    return start;
  }
}