import java.util.Scanner;

public class P_1850C_WordOnThePaper {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- > 0) {
      char[][] grid = new char[8][8];
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 8; i++) {
        String line = input.next();
        for (int j = 0; j < 8; j++) {
          grid[i][j] = line.charAt(j);
        }
      }
      for (char[] col : grid) {
        for (char c : col) {
          if (c != '.') {
            sb.append(c);
          }
        }
      }
      System.out.println(sb.toString());
    }
  }
}