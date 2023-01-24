import java.util.Scanner;

public class P_89A_StringTask {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = input.next().toLowerCase();
    String s2 = "";
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'o' || s1.charAt(i) == 'y'
          || s1.charAt(i) == 'u' || s1.charAt(i) == 'i') {
        continue;
      } else {
        s2 += ".";
        s2 += s1.charAt(i);
      }
    }
    System.out.println(s2);
  }
}