import java.util.Scanner;

public class P_266A_StonesOnTheTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String s = input.next();
    int count = 0;
    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        count++;
      }
    }
    System.out.println(count);
  }
}
