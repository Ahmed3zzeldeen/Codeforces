import java.util.*;

public class P_977C_LessOrEqual {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();

    ArrayList<Integer> arr = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      arr.add(input.nextInt());
    }
    Collections.sort(arr);
    System.out.println((k == 0) ? (arr.get(0) == 1) ? -1 : arr.get(0) - 1
        : (k == n) ? arr.get(n - 1) : (Objects.equals(arr.get(k - 1), arr.get(k))) ? -1 : arr.get(k - 1));
  }
}
