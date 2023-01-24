import java.util.Scanner;

public class P_1A_NextRound {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = 0;
    int n = input.nextInt();
    int k = input.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++)
      arr[i] = input.nextInt();
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] >= arr[k - 1] && arr[j] > 0)
        count++;
    }
    System.out.println(count);
  }
}