import java.util.Scanner;

public class P_1850A_ToMyCritics {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int a, b, c;
      a = input.nextInt();
      b = input.nextInt();
      c = input.nextInt();
      if (a + b >= 10 || a + c >= 10 || b + c >= 10) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}