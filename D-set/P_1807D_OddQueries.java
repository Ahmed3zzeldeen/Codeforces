import java.util.Scanner;

public class P_1807D_OddQueries {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int n = input.nextInt();
      int q = input.nextInt();
      int[] arr = new int[n + 1];
      long[] pre = new long[n + 1];
      for (int i = 1; i <= n; i++) {
        arr[i] = input.nextInt();
        pre[i] = arr[i];
      }
      /*
       * main arr = 2 2 1 3 2
       * prefix arr = 2 4 6 10 16
       * q 2 3 c 3 => 2 3 3 3 2
       * sum = 13
       * 
       * pre[3] - pre[1] == 4
       * n = 5 -- l 2 -- r 3 -- 3
       * pre[n] - (pre[r] - pre[l - 1]) + (r - l+1) * c;
       * pre[5] - (pre[3] - pre[2 - 1]) + (3 - 2+1) * 3;
       * 16 - (6 - 2) (0)*3 == 13
       */
      for (int i = 1; i <= n; i++) { // prefix arr
        pre[i] = pre[i] + pre[i - 1];
      }
      while (q-- != 0) {
        int l, r, c;
        l = input.nextInt();
        r = input.nextInt();
        c = input.nextInt();
        long sum = pre[n] - (pre[r] - pre[l - 1]) + (r - (l + 1)) * c;
        if (sum % 2 == 0) {
          System.out.println("NO");
        } else {
          System.out.println("YES");
        }
      }
    }
  }
}