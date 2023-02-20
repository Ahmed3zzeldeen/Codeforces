import java.util.Scanner;

public class P_1703C_Cypher {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int n = input.nextInt();
      int[] initArray = new int[n];
      for (int i = 0; i < initArray.length; i++) {
        initArray[i] = input.nextInt();
      }
      for (int i = 0; i < n; i++) {
        int b = input.nextInt();
        String suq = input.next();
        for (int j = 0; j < suq.length(); j++) {
          if (suq.charAt(j) == 'D') {
            initArray[i] = ((initArray[i] == 9) ? 0 : initArray[i] + 1);
          } else if (suq.charAt(j) == 'U') {
            initArray[i] = ((initArray[i] == 0) ? 9 : initArray[i] - 1);
          }
        }
      }
      for (int i = 0; i < initArray.length; i++) {
        System.out.println(initArray[i]);
      }
    }
  }
}