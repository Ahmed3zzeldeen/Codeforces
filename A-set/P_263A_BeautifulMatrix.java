import java.util.Scanner;

public class P_263A_BeautifulMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // int[][] matrix = new int[5][5];
    int x = 0;
    mainLoop: for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        x = input.nextInt();
        if (x == 1) {
          System.out.println((Math.abs((j - 2)) + Math.abs((i - 2))));
          break mainLoop;
        }
      }
    }
  }
}