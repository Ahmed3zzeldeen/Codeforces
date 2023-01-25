import java.util.Scanner;

public class P_474B_Worms {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      long sum = 0;
      int n = input.nextInt();
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = input.nextInt();
        sum += arr[i];
        arr[i] = sum;
      }
      int m = input.nextInt();
      long[] q = new long[m];
      for (int i = 0; i < m; i++) {
        q[i] = input.nextLong();
      }
      for (int i = 0; i < m; i++) {
        System.out.println(binarySearch(arr, 0, n - 1, q[i]));
      }
    }
  }

  public static int binarySearch(long[] arr, int lower, int upper, long key) {
    while (lower < upper) {
      int mid = (lower + upper) / 2;
      if (arr[mid] < key) {
        lower = mid + 1;
      } else {
        upper = mid;
      }
    }
    return lower + 1;
  }
}