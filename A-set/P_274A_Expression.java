import java.util.Scanner;

public class P_274A_Expression {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
    if (a == 1)
      b++;
    if (c == 1)
      b++;
    if (b == 1) {
      if (a > c) {
        b += c;
        c = 1;
      } else if (a < c) {
        b += a;
        a = 1;
      } else {
        b += c;
        c = 1;
      }
    }
    System.out.println((a == 1 && c == 1) ? (b) : (a * b * c));
  }
}