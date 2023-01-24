import java.util.Scanner;

public class P_340A_Elephant {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int steps = 0;
    while (x >= 5) {
      x -= 5;
      steps++;
    }
    System.out.println((x == 0) ? steps : steps + 1);
  }
}