import java.util.Scanner;

public class P_1A_TheatreSquare {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n = input.nextLong();
    long m = input.nextLong();
    long a = input.nextLong();
    long x = Math.round(Math.ceil((double) m / a));
    long y = Math.round(Math.ceil((double) n / a));
    System.out.println(x * y);
  }
}