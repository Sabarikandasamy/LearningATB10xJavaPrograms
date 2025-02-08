package Other_Projects;

import java.util.Scanner;

public class Vowel_Consonent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter your Name: ");

        String input = sc.nextLine(); // Read user input

        input = input.toLowerCase(); // Convert to lowercase for easier comparison

        int vowels = 0, consonents = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') { //Check if the character is a letter

           if (ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch == 'u') {
               vowels++; //Increment vowel count
           } else {
               consonents++; //Increment consonant count

           }
        }
    }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonents: " + consonents);

        sc.close(); // Close the scanner

}
}
