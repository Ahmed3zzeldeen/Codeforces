import java.util.Scanner;

public class P_142B_Tprimes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long[] arr = new long[1000001];
    arr[1] = 1;
    for (long i = 2; i <= 1000; i++) {
      for (long z = 2 * i; z <= 1000000; z += i) {
        arr[(int) z] = 1;
      }
    }
    int n = input.nextInt();
    long[] tests = new long[n];
    for (int i = 0; i < n; i++) {
      tests[i] = input.nextLong(); // 4
    }
    // for test
    for (int i = 0; i < n; i++) {
      if (checkPerfectSquare(tests[i]) && arr[(int) Math.sqrt(tests[i])] == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

  public static boolean checkPerfectSquare(long n) {
    double sqrt_n = Math.sqrt(n);
    if (sqrt_n == (int) sqrt_n) {
      return true;
    } else {
      return false;
    }
  }
}