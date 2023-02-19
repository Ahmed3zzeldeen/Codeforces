import java.util.Scanner;

public class P_1703B_ICPCBalloons {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int n = input.nextInt();
      String s = input.next();
      int[] freq = new int[27];
      int total = 0;
      for (int i = 0; i < n; i++) {
        if (freq[(int) (s.charAt(i) - 'A')] == 0) {
          freq[(int) (s.charAt(i) - 'A')] += 2;
        } else {
          freq[(int) (s.charAt(i) - 'A')]++;
        }
      }
      for (int i = 0; i < freq.length; i++) {
        total += freq[i];
      }
      System.out.println(total);
    }
  }
}
