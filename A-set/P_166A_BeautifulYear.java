import java.util.Scanner;

public class P_166A_BeautifulYear {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year = input.nextInt() + 1;
    int n = year, x = 1, y = 1, z = 3, h = 4;
    while (x == y || x == z || x == h || y == z || y == h || z == h) {
      x = n % 10;
      n /= 10;
      y = n % 10;
      n /= 10;
      z = n % 10;
      n /= 10;
      h = n % 10;
      if (x == y || x == z || x == h || y == z || y == h || z == h) {
        year += 1;
        n = year;
      } else {
        System.out.println(year);
        break;
      }
    }
  }
}