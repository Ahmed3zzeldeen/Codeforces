import java.util.*;

public class P_790A_Lucky {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      String s = input.next();
      int sumFirst = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1))
          + Character.getNumericValue(s.charAt(2));
      int sumLast = Character.getNumericValue(s.charAt(s.length() - 1))
          + Character.getNumericValue(s.charAt(s.length() - 2)) + Character.getNumericValue(s.charAt(s.length() - 3));
      if (sumFirst == sumLast) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}