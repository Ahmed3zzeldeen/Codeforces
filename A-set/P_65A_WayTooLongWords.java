import java.util.Scanner;

public class P_65A_WayTooLongWords {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String[] arr = new String[n];
    for (int j = 0; j < n; j++) {
      arr[j] = input.next();
    }
    for (int i = 0; i < n; i++) {
      if (arr[i].length() > 10) {
        System.out.println(arr[i].charAt(0) + "" + (arr[i].length() - 2) + arr[i].charAt(arr[i].length() - 1));
      } else {
        System.out.println(arr[i]);
      }
    }
  }
}
