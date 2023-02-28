import java.util.Scanner;

public class P_266B_QueueAtTheSchool {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int t = input.nextInt();
    String s = input.next();
    char[] arr = new char[n];
    for (int i = 0; i < n; i++) {
      arr[i] = s.charAt(i);
    }
    for (int i = 0; i < t; i++) {
      int prevIndex = -1;
      for (int j = 1; j < n; j++) {
        if (j == prevIndex) {
          continue;
        } else if (arr[j - 1] == 'B' && arr[j] == 'G') {
          prevIndex = j + 1;
          arr[j - 1] = 'G';
          arr[j] = 'B';
        }
      }
    }
    s = new String(arr);
    System.out.println(s);
  }
}
