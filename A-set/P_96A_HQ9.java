import java.util.Scanner;

public class P_96A_HQ9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String s = input.next();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'H' || s.charAt(i) == 'Q' || s.charAt(i) == '9') {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}