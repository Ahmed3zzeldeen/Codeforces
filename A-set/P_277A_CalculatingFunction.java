import java.util.Scanner;

public class P_277A_CalculatingFunction {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n = input.nextLong(), sum = 0, pos = 0, neg = 0;
    sum = (n * (n + 1)) / 2;
    if (n % 2 == 0) {
      pos = ((sum - (n / 2)) / 2) + (n / 2);
      neg = -((sum - (n / 2)) / 2);
    } else {
      n++;
      neg = -((sum - (n / 2)) / 2);
      pos = ((sum - (n / 2)) / 2) - (n / 2);
    }
    System.out.println(pos + neg);
  }
}