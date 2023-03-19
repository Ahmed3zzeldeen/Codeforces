import java.util.*;

public class P_1807A_PlusOrMinus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
      if (a + b == c && a <= 9 && b <= 9 && a >= 1 && b >= 1 && c >= -8 && c <= 18) {
        System.out.println("+");
      } else if (a - b == c && a <= 9 && b <= 9 && a >= 1 && b >= 1 && c >= -8 && c <= 18) {
        System.out.println("-");
      }
    }
  }
}
