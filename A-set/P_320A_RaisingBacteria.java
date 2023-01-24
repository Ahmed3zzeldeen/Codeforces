import java.util.*;

public class P_320A_RaisingBacteria {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt(), count = 0;
    String s = Integer.toBinaryString(x);
    for (int i = 0; i < s.length(); i++) {
      count += (s.charAt(i) == '1') ? 1 : 0;
    }
    System.out.println(count);
  }
}