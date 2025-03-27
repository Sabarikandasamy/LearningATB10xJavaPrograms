package Other_Projects.Task_29_Jan;

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the character");
    char ch = scanner.next().charAt(0);

    char lowerCh = Character.toLowerCase(ch);

        if (Character.isLetter(ch)) {
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println(ch + " is a vowel."); // Added space after "ch"
        } else {
            System.out.println(ch + " is a consonant."); // Fixed typo: "consonent" → "consonant"
        }
    } else {
        System.out.println(ch + " is not a valid letter."); // Added space after "ch"
    }
}
}