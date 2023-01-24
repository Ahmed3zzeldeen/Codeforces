import java.util.Scanner;

public class P_143A_Team {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int t = input.nextInt();
      int canSolve = 0;
      while (t-- != 0) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = input.nextInt();
        }
        if (arr[0] == 1 && arr[1] == 1 ||
            arr[0] == 1 && arr[2] == 1 ||
            arr[1] == 1 && arr[2] == 1) {
          canSolve++;
        }
      }
      System.out.println(canSolve);
    }
  }
}