import java.util.Scanner;

public class P_85A_PetyaAndStrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = input.next();
    String s2 = input.next();
    int Value = s1.compareToIgnoreCase(s2);
    if (Value == 0)
      System.out.println(0);
    else if (Value < 0)
      System.out.println(-1);
    else
      System.out.println(1);
  }
}