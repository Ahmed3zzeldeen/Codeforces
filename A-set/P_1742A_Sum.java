import java.util.Scanner;
public class P_1742A_Sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = 0;
    t = input.nextInt();
    while (t-- != 0) {
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      if (a + b == c || a + c == b || b + c == a) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
