import java.util.Scanner;

public class P_1742C_Stripes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      String[] strings = new String[8];
      for (int i = 0; i < 8; i++) {
        strings[i] = input.next();
      }
      int R = 0;
      int B = 0;
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
          if (strings[i].charAt(j) == 'R')
            R++;
        }
        if (R != 8) {
          R = 0;
          continue;
        }
        if (R == 8)
          break;
      }
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
          if (strings[j].charAt(i) == 'B')
            B++;
        }
        if (B != 8) {
          B = 0;
          continue;
        }
        if (B == 8)
          break;
      }
      if (R == 8)
        System.out.println("R");
      if (B == 8)
        System.out.println("B");
    }
  }
}