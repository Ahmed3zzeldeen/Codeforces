import java.util.Scanner;

public class P_197A_HelpfulMaths {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.next();
    int j = 0;
    char[] s2 = new char[s.length()];
    char[] f = new char[s.length()];
    for (int m = 0; m < s.length(); m++) {
      s2[m] = s.charAt(m);
      f[m] = s.charAt(m);
    }
    for (int i = 0; i < s2.length; i++) {
      if (s2[i] == '1') {
        f[j] = '1';
        j += 2;
      }
    }
    for (int r = 0; r < s2.length; r++) {
      if (s2[r] == '2') {
        f[j] = '2';
        j += 2;
      }
    }
    for (int a = 0; a < s2.length; a++) {
      if (s2[a] == '3') {
        f[j] = '3';
        j += 2;
      }
    }
    for (int t = 0; t < f.length; t++)
      System.out.print(f[t]);
  }
}