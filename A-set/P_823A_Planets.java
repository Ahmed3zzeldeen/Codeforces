import java.util.*;

public class P_823A_Planets {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int n = input.nextInt();
      int c = input.nextInt();
      int totalCost = 0, count = 1;
      int[] orbits = new int[n];
      for (int i = 0; i < orbits.length; i++) {
        orbits[i] = input.nextInt();
      }
      if (n == 1) {
        totalCost = 1;
      } else {
        Arrays.sort(orbits);
        for (int i = 1; i < orbits.length; i++) {
          if (orbits[i] != orbits[i - 1]) {
            totalCost += Math.min(count, c);
            count = 1;
          } else {
            count++;
          }
        }
        totalCost += Math.min(count, c);
      }
      System.out.println(totalCost);
    }
  }
}