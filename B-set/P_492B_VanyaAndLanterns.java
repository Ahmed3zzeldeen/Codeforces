import java.util.Arrays;
import java.util.Scanner;

public class P_492B_VanyaAndLanterns {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int l = input.nextInt();
    int[] arr = new int[n];
    double distance = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = input.nextInt();
    }
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] - arr[i] > distance) {
        distance = arr[i + 1] - arr[i];
      }
    }
    if ((distance / 2) > arr[0] && (distance / 2) > (l - arr[n - 1])) {
      distance /= 2;
    } else if ((l - arr[n - 1]) >= arr[0]) {
      distance = l - arr[n - 1];
    } else {
      distance = arr[0];
    }
    System.out.println(distance);
  }
}