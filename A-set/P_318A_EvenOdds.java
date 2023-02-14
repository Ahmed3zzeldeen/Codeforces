import java.util.Scanner;

public class P_318A_EvenOdds {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      long n = input.nextLong();
      long k = input.nextLong();
      long res = 0;

      if ((n%2==0)) {
        if ((k<=n/2)) {
          res = k+k-1;
        } else {
          res = (k-(n/2))*2;
        }
      } else {
        if ((k<=(n/2)+1)) {
          res = k+k-1;
        } else {
          res = (k-(n/2)-1)*2;
        }
      }
      System.out.println(res);
    }
  }
}