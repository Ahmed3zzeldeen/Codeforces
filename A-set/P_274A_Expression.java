import static java.lang.Math.*;
import java.util.Scanner;

public class P_274A_Expression {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    long Answer1 = a + b + c;
    long Answer2 = a * b * c;
    long Answer3 = (a + b) * c;
    long Answer4 = a * (b + c);
    long Answer5 = a * b + c;
    long Answer6 = a + b * c;
    long MAX1 = max(max(Answer1, Answer2), max(Answer3, Answer4));
    long MAX2 = max(Answer5, Answer6);
    System.out.println(max(MAX1, MAX2));
  }
}