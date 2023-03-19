import java.util.Scanner;

public class P_1807B_GrabTheCandies {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int n = input.nextInt();
      int numOfCandiesWithMihai = 0;
      int numOfCandiesWithBianca = 0;
      for (int i = 0; i < n; i++) {
        int test = input.nextInt();
        if (test % 2 == 0) {
          numOfCandiesWithMihai += test;
        } else {
          numOfCandiesWithBianca += test;
        }
      }
      if (numOfCandiesWithMihai > numOfCandiesWithBianca) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
