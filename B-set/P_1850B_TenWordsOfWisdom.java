import java.util.Scanner;

public class P_1850B_TenWordsOfWisdom {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int n = input.nextInt(); // number of responses
      int maxQuality = -1;
      int winner = -1;
      for (int i = 1; i <= n; i++) {
        int ai = input.nextInt(); // number of words
        int bi = input.nextInt(); // quality
        if (ai <= 10 && bi > maxQuality) {
          maxQuality = bi;
          winner = i;
        }
      }
      System.out.println(winner);
    }
  }
}