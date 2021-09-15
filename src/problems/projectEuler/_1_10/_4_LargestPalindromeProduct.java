package problems.projectEuler._1_10;

import java.util.ArrayList;
import java.util.Arrays;

public class _4_LargestPalindromeProduct {
    public static void main(String[] args) {

        ArrayList<Integer> palindromes = new ArrayList<>();

        System.out.println("Printing all palindromes that are the product of two 3-digit numbers.");

        // O(n^2) nested loop
        for (int i = 100; i <= 999; i++) {
           for (int j = 100; j <= 999; j++) {

               // Edge case, anything multiplied by 100 will not be a palindrome
               if (i == 100 || j == 100) {
                    continue;
               }

               if (isPalindrome(i*j)) {
                   palindromes.add(i*j);
                   System.out.println(i + " * " + j + " = " + i*j + " is a palindrome");
               }
           }
        }

        System.out.println("\nThere are " + palindromes.size() + " palindromes");
        System.out.println("The largest palindrome is " + largestPalindrome(palindromes));
    }

    private static boolean isPalindrome(int number) {
        // Edge case, single digit numbers are palindromes by default
        if (number < 10 && number > -10) {
            return true;
        }

        String stringNum = String.valueOf(number);
        char[] charNum = stringNum.toCharArray();
        String reversedNum = reverseString(stringNum);
        char[] reversedChar = reversedNum.toCharArray();

        return Arrays.equals(charNum, reversedChar);
    }

    private static String reverseString(String string) {
        char[] chars = string.toCharArray();
        char[] reversedChars = new char[string.length()];

        // O(n)
        for (int i = 0; i < string.length(); i++) {
            reversedChars[i] = chars[string.length() - i - 1];
        }

        return new String(reversedChars);
    }

    private static int largestPalindrome(ArrayList<Integer> arrayList) {
        int largest = -1;

        // O(n)
        for (Integer item : arrayList) {
            if (item > largest) {
                largest = item;
            }
        }

        return largest;
    }
}
