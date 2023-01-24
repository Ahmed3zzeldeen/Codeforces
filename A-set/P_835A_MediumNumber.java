import java.util.*;

public class P_835A_MediumNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int[] arr = new int[3];
      arr[0] = input.nextInt();
      arr[1] = input.nextInt();
      arr[2] = input.nextInt();
      Arrays.sort(arr);
      System.out.println(arr[1]);
    }
  }
}
