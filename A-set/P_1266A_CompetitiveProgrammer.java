import java.util.Scanner;

public class P_1266A_CompetitiveProgrammer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      boolean isEven = false;
      int zero = 0;
      int sum = 0;
      String s = input.next();
      for (char c : s.toCharArray()) {
        int i = c - '0';
        sum += i;
        if (i == 0)
          zero++;
        if (i % 2 == 0 && i != 0)
          isEven = true;
      }
      if (sum % 3 == 0 && isEven && zero > 0) {
        System.out.println("red");
      } else if (sum % 3 == 0 && zero > 1) {
        System.out.println("red");
      } else {
        System.out.println("cyan");
      }
    }
  }
}