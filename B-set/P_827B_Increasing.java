import java.util.*;

public class P_827B_Increasing {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t != 0) {
      int n = input.nextInt(), x = 0;
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = input.nextInt();
      }
      Arrays.sort(arr);
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] == arr[i + 1]) {
          x++;
          break;
        }
      }
      System.out.println((x > 0) ? "NO" : "YES");
      t--;
    }
  }
}