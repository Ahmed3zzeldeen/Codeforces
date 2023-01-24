import java.util.Scanner;

public class P_627C_FrogJumps {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      String s = input.next().toUpperCase();
      s = " " + s;
      s += " ";
      int max = 1;
      int prevIndex = 1;
      for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == 'R' || i == (s.length() - 1)) {
          max = Math.max(max, prevIndex);
          prevIndex = 1;
        } else {
          prevIndex++;
        }
      }
      System.out.println(max);
    }
  }
}