import java.util.*;

public class P_835B_Atilla_sFavoriteProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- != 0) {
            int n = input.nextInt();
            String s = input.next();
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            char c = ch[ch.length - 1];
            int count = 0;
            for (char chh = 'a'; chh <= c; chh++) {
                count++;
            }
            System.out.println(count);
        }
    }
}