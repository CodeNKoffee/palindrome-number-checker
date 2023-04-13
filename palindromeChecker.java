import java.util.Scanner;

public class palindromeChecker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = scanner.nextInt();
    if (palindromeNum(num)) {
      System.out.println(num + " is a palindrome.");
    } else {
      System.out.println(num + " is not a palindrome.");
    }
    scanner.close();
  }

  public static boolean palindromeNum(int n) {
    if (n == 0) {
      return true;
    } else if (n < 0) {
      return false;
    }
    int divisor = 1;
    while (n / divisor >= 10) {
      divisor *= 10;
    }
    while (n != 0) {
      int leadingDigit = n / divisor;
      int trailingDigit = n % 10;
      if (leadingDigit != trailingDigit) {
        return false;
      }
      n = (n % divisor) / 10;
      divisor /= 100;
    }
    return true;
  }
}
