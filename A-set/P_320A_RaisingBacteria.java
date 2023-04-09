import java.util.Scanner;

public class P_320A_RaisingBacteria {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int n = input.nextInt();
      System.out.println(Integer.bitCount(n));
    }
  }
}