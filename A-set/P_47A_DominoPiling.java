import java.util.Scanner;

public class P_47A_DominoPiling {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int m = input.nextInt();
    int n = input.nextInt();
    int area = n * m;
    if (area % 2 == 0)
      System.out.println(area / 2);
    else
      System.out.println((area - 1) / 2);
  }
}