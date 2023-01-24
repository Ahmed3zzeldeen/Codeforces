import java.util.Scanner;

public class P_834A_YesYes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      String s1 = input.next();
      String s2 = "YesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYes";
      if ((s2.contains(s1)) && (!s1.contains("Yess") && !s1.contains("YES") && !s1.contains("se"))) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}