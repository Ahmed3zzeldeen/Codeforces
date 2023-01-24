import java.util.Scanner;

public class P_405A_BearAndBigBrother {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int i = 0;
    while (a <= b) {
      a *= 3;
      b *= 2;
      i++;
    }
    System.out.println(i);
  }
}
