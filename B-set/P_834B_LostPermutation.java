import java.util.*;

public class P_834B_LostPermutation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int m = input.nextInt();
      int s = input.nextInt();
      int[] arr = new int[m];
      int maxValue = Integer.MIN_VALUE;
      int sumValues = 0;
      for (int i = 0; i < arr.length; i++) {
        arr[i] = input.nextInt();
        if (arr[i] > maxValue)
          maxValue = arr[i];
        sumValues += arr[i];
      }
      Arrays.sort(arr);
      int sumLosted = ((maxValue * (maxValue + 1)) / 2) - sumValues;
      s = s - sumLosted;
      while (s > 0) {
        s -= (maxValue + 1);
        maxValue++;
      }
      if (s == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}