import java.util.Scanner;

public class p_281A_WordCapitalization {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String word = input.next();

    if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
      word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
    System.out.println(word);
  }
}
