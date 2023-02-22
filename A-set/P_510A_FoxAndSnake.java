import java.util.Scanner;

public class P_510A_FoxAndSnake {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt(), m = input.nextInt();
    char[][] s = new char[n][m];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        s[i][j] = (i % 2 == 0) ? '#' : '.';
    for (int i = 1; i < n; i += 4)
      s[i][m - 1] = '#';
    for (int i = 3; i < n; i += 4)
      s[i][0] = '#';
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++)
        System.out.print(s[i][j]);
      System.out.println("");
    }
  }
}