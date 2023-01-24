import java.util.Scanner;

public class P_1725G_Garage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n = input.nextLong();
    if (n == 1) {
      n = 3;
    } else if (n == 2) {
      n = 5;
    } else if (n % 3 == 0) {
      n = 6 + (n - 3) + (n / 3);
    } else if (n % 3 == 1) {
      n = 7 + (n - 4) + (n / 3);
    } else if (n % 3 == 2) {
      n = 8 + (n - 5) + (n / 3);
    }
    System.out.println(n);
  }
}