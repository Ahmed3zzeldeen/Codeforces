import java.util.Scanner;

public class P_142A_Dragons {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int s = input.nextInt(), n = input.nextInt(), x = 0;
    int[][] arr = new int[n][2];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < 2; j++)
        arr[i][j] = input.nextInt();
    for (int j = 0; j < n; j++) {
      for (int i = 0; i < n; i++) {
        if (s > arr[i][0] && arr[i][0] != 0) {
          s += arr[i][1];
          arr[i][0] = 0;
          x++;
          i = 0;
        }
      }
    }
    System.out.println((x == n) ? "YES" : "NO");
  }
}