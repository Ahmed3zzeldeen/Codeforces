import java.util.Scanner;

public class P_26B_RegularBracketSequence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int countClosed = 0;
    int countRightBracket = 0;
    String c = input.next();
    for (int i = 0; i < c.length(); i++) {
      if (c.charAt(i) == '(') {
        countRightBracket++;
      } else if (countRightBracket != 0 && c.charAt(i) == ')') {
        countRightBracket--;
        countClosed += 2;
      }
    }
    System.out.println(countClosed);
  }
}