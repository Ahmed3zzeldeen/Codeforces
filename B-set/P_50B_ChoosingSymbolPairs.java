import java.util.Scanner;

public class P_50B_ChoosingSymbolPairs {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      String s = input.next();
      long[] arr = new long[27];
      long[] num = new long[10];
      for (int i = 0; i < s.length(); i++) {
        if (!Character.isDigit(s.charAt(i))) {
          arr[s.charAt(i) - 'a']++;
        } else {
          num[s.charAt(i) - '0']++;
        }
      }
      long pairs = 0;
      for (int i = 0; i < 27; i++) {
        pairs += (arr[i] * arr[i]);
      }
      for (int i = 0; i < 10; i++) {
        pairs += (num[i] * num[i]);
      }
      System.out.println(pairs);
    }
  }
}
