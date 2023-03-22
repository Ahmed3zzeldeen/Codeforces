import java.util.Scanner;

public class P_219774Y_RangeSumQuery {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int n = input.nextInt();
      int q = input.nextInt();
      int[] arr = new int[n + 1];
      long[] pre = new long[n + 1];

      for (int i = 1; i <= n; i++) {
        arr[i] = input.nextInt();
        pre[i] = arr[i];
      }

      // prefix sum
      for (int i = 1; i <= n; i++) {
        pre[i] = pre[i] + pre[i - 1];
      }

      while (q-- != 0) {
        int l = input.nextInt();
        int r = input.nextInt();
        long sum = pre[r] - pre[l - 1];
        System.out.println(sum);
      }
    }

  }
}