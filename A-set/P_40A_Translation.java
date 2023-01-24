import java.util.Scanner;

public class P_40A_Translation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.next();
    String t = input.next();
    String test = "";
    if (s.length() != t.length()) {
      System.out.println("NO");
    } else {
      for (int i = t.length() - 1; i >= 0; i--) {
        test += t.charAt(i);
      }
      if (test.equals(s)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}