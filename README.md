# Documentation for Palindrome Number Checker

This program checks if a given number is a palindrome.

## Method Definition

The `palindromeNum(int n)` method takes an integer `n` as input and returns a boolean value indicating whether `n` is a palindrome or not. The method has the following logic:

1. If `n` is 0, return true.
2. If `n` is negative, return false.
3. If `n` is even, compare each digit from both ends until the middle is reached.
4. If `n` is odd, ignore the middle digit and compare each digit from both ends until the middle is reached.

## Method Invocation

The `palindromeNum(int n)` method can be invoked by calling it from another part of the program. This can be done using the following code:

```java
boolean isPalindrome = palindromeNum(-22);
// Output: false for negative numbers

boolean isPalindrome = palindromeNum(0);
// Output: true for zero

boolean isPalindrome = palindromeNum(12321);
// Ouput: true for odd-lengthed numbers

boolean isPalindrome = palindromeNum(1221);
// Output: true for even-lengthed numbers

