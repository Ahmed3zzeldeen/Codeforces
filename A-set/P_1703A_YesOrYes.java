import java.util.*;

public class P_1703A_YesOrYes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      String s = input.next().toLowerCase();
      if (s.length() > 3) {
        System.out.println("NO");
        continue;
      }
      if (s.charAt(0) == 'y' && s.charAt(1) == 'e' && s.charAt(2) == 's') {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
