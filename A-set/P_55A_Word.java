import java.util.Scanner;

public class P_55A_Word {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.next();
    int x = 0, y = s.length();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) <= 122 && s.charAt(i) >= 97) {
        x++;
      }
    }
    System.out.println((x >= y / 2.0) ? s.toLowerCase() : s.toUpperCase());
  }
}
