package Other_Projects;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)

        Scanner sc = new Scanner(System.in);

        // Input the string from the user
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close(); // Close the scanner
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0; // Pointer to the start of the string
        int right = str.length() - 1; // Pointer to the end of the string

        // Compare characters from the start and end moving towards the center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++; // Move the left pointer forward
            right--; // Move the right pointer backward
        }
        return true; // If all characters match, it's a palindrome
    }
}