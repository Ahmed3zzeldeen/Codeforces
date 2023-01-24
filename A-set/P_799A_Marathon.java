import java.util.*;

public class P_799A_Marathon {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();
    for (int i = 0; i < cases; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int d = in.nextInt();
      int count = 0;
      if (a < b) {
        count++;
      }
      if (a < c) {
        count++;
      }
      if (a < d) {
        count++;
      }
      System.out.println(count);
    }
  }
}