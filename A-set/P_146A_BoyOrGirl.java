import java.util.Scanner;

public class P_146A_BoyOrGirl {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name = input.next();
    char[] nameasarr = Changetoarray(name);
    int x = clear(nameasarr);
    System.out.println((x % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!");
  }

  public static int clear(char[] name) {
    int count = name.length;
    for (int i = 0; i < name.length; i++) {
      for (int j = i; j < name.length; j++) {
        if (name[i] == name[j] && i != j) {
          count--;
          break;
        }
      }
    }
    return count;
  }

  public static char[] Changetoarray(String s) {
    char[] m = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      m[i] = s.charAt(i);
    }
    return m;
  }
}