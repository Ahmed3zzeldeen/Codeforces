import java.util.Scanner;

public class P_670D_MagicPowder_2 {

  static int n;
  static long magic;
  static int[] weNeed;
  static int[] weHave;

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      n = input.nextInt();
      magic = input.nextLong();
      weHave = new int[n];
      weNeed = new int[n];

      for (int i = 0; i < n; i++) {
        weNeed[i] = input.nextInt();
      }
      for (int i = 0; i < n; i++) {
        weHave[i] = input.nextInt();
      }
      System.out.println(BSfindFirst(0, 2000000009));
    }

  }

  public static boolean iCanCook(long x) {
    long k = 0;
    for (int i = 0; i < n; i++) {
      if (weNeed[i] * x > weHave[i]) {
        k += weNeed[i] * x - weHave[i];
      }
      if (k > magic) {
        return false;
      }
    }

    return (magic >= k);

  }

  public static long BSfindFirst(long start, long end) {
    while (start < end) {
      long mid = start + (end - start + 1) / 2;
      if (iCanCook(mid)) {
        start = mid;
      } else {
        end = mid - 1;
      }
    }
    return start;
  }
}