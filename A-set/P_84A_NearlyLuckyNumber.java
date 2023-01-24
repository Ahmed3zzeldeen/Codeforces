import java.util.Scanner;

public class P_84A_NearlyLuckyNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.next();
    int x = 0;
    if (s.length() == 1)
      System.out.println("NO");
    else {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '4' || s.charAt(i) == '7') {
          x++;
        }
      }
      System.out.println((x == 4 || x == 7) ? "YES" : "NO");
    }
  }
}