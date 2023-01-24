import java.util.Scanner;

public class P_355A_VanyaAndFence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int h = input.nextInt();
    int[] arr = new int[n];
    int count = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }
    for (int j = 0; j < n; j++) {
      if (arr[j] > h) {
        count++;
      }
    }
    System.out.println((n - count) + (count * 2));
  }
}
