import java.util.*;

public class P_1703D_DoubleString {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- != 0) {
      int n = input.nextInt(), count = 0;
      HashMap<String, Integer> map = new HashMap<>();
      String[] s = new String[n];
      String result = "";
      for (int i = 0; i < n; i++) {
        s[i] = input.next();
        map.put(s[i], i);
      }
      for (int i = 0; i < n; i++) {
        count = 0;
        for (int j = 0; j < s[i].length(); j++) {
          if (map.containsKey(s[i].substring(0, j)) && map.containsKey(s[i].substring(j))) {
            result += 1;
            break;
          } else {
            count++;
          }
        }
        result += (count == s[i].length() ? 0 : "");
      }
      System.out.println(result);
    }
  }
}
