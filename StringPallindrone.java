//  Write a program to check if a given string is palindrome.

import java.util.Scanner;

public class StringPallindrone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Continue comparing characters from both ends until they meet in the middle
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                // If characters at current positions don't match, it's not a palindrome
                return false;
            }
            left++;
            right--;
        }
        // If all characters matched, it's a palindrome
        return true;
    }
}

