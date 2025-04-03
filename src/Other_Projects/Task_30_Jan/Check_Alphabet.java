package Other_Projects.Task_30_Jan;

import java.util.Scanner;

public class Check_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input: ");
        String input = sc.next();
        if (input.length() > 1) {
            System.out.println("Invalid input! Please enter only ONE character.");
        } else {
            char ch = input.charAt(0);
            if ((ch >= 'A' && ch <= 'Z') || (ch >='a' && ch <= 'z')) {
                System.out.println(ch + " is an alphabet.");
            } else {
            System.out.println(ch + " is Not an alphabet.");
        }
        sc.close();
    }
}}
