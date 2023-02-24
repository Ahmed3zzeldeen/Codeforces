import java.util.Scanner;

public class P_734A_AntonAndDanik {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String x = input.next();
    int A = 0, D = 0;
    for (int i = 0; i < x.length(); i++) {
      if (x.charAt(i) == 'A') {
        A++;
      } else {
        D++;
      }
    }
    if (A == D) {
      System.out.println("Friendship");
    } else if (A > D) {
      System.out.println("Anton");
    } else {
      System.out.println("Danik");
    }
  }
}