import java.util.Scanner;

public class P_366A_Hulk {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for (int i = 0; i < n; i++) {
      if (i == n - 1) {
        if (n % 2 == 0) {
          System.out.print("I love it");
        } else {
          System.out.print("I hate it");
        }
      } else {
        if (i % 2 == 0) {
          System.out.print("I hate that ");
        } else {
          System.out.print("I love that ");
        }
      }
    }
  }
}
