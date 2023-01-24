import java.util.Scanner;

public class P_266A_CheapTravel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, a, b, up = 0, gp = 0;
        n = input.nextInt();
        m = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();
        up = n * a;
        gp = ((n / (m * 1.0)) * 10 % 10 == 0) ? (n / m) * b
                : (b > (n % m) * a) ? ((n / m) * b) + (n % m) * a : ((n / m) * b) + b;
        System.out.println((gp < up) ? gp : up);
    }
}