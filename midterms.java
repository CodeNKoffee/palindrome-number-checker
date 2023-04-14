import java.util.*;
import java.math.*;

public class midterms {
  public static void main(String[] args) {
    // Midterm 2006
    // Question 1 - A
    char c = ' ';
    int i = 0;

    switch (c) {
      case 'a':
        i = 1;
        break;

      case 'b':
        i = 2;
        break;

      case 'c':
        i = 3;
        break;

      default:
        i = 4;
    }


    // Question 1 - B
    int value = 2;
    System.out.println("Enter an integer - 0 to quit.");
    // value = Keyboard.readInt();

    while(value != 0) {
      System.out.println("Enter an integer - 0 to quit.");
      // value = Keyboard.readInt();
    }


    // Question 1 - C
    int x, y = 5;
    
    if (y < 10) {
      do {
        x = y * 2;
        y += 2;
        System.out.println(x);
      } while (y < 10);
    }


    // Question 1 - D
    int m = 0;
    int n = 0;
    int o = 0;

    while (m < 10) {
      if ((m % 2) == 0)
        n++;
      else o++;
      m++;
    }

    // Question 3 - C
    int number = 1234;
    int divisor = 1;
    int temp = number;

    if (number >= 0 && number <= 9) {
      System.out.println(number);
    }
    else if (number > 9) {
      // First, find the divisor needed to get the leftmost digit
      while (temp >= 10) {
        divisor *= 10;
        temp /= 10;
      }

      int newNumber = 0;

      // Repeatedly take the rightmost digit and add it to newNumber
      while (number != 0) {
        int digit = number % 10;
        newNumber += digit * divisor;
        divisor /= 10;
        number /= 10;
      }

      System.out.println(newNumber);
    }
  }
}

/*
 * 
 * ---------------
 * 1234 % 1000 = 4
 * 4 * 1000 = 4000
 * 1234 / 10 = 123
 * 
 * 123 % 100 = 3
 * 3 * 100 = 300
 * 123 / 10 = 12
 * 
 * 12 % 10 = 2
 * 2 * 10 = 20
 * 12 / 10 = 1
 * 
 * 1 % 1 = 0
 * newNumber += 1
 * 
 */