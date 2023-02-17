import java.util.Scanner;

public class P_977B_TwoGram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String s = input.next();
    int max = 0;
    String result = "";
    for (int i = 0; i < n - 1; i++) {
      String gramTest = s.substring(i, i + 2);
      int freq = 0;
      for (int j = 0; j < n - 1; j++) {
        if (("" + gramTest.charAt(0)).equals("" + s.charAt(j))
            && (("" + gramTest.charAt(1)).equals("" + s.charAt(j + 1)))) {
          freq++;
        }
      }
      if (freq >= max) {
        max = freq;
        result = gramTest;
      }
    }
    System.out.println(result);
  }
}
