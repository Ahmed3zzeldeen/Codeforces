import java.util.Scanner;

public class P_304A_SoldierAndBananas {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int k = input.nextInt();
    int n = input.nextInt();
    int w = input.nextInt();
    int prise = 0;
    for (int i = 1; i <= w; i++) {
      prise += i * k;
    }
    if (n > prise)
      System.out.println(0);
    else
      System.out.println(prise - n);
  }

}
