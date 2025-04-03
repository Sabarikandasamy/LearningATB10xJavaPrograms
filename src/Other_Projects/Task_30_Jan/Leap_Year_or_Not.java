package Other_Projects.Task_30_Jan;

import java.util.Scanner;

public class Leap_Year_or_Not {
    public static void main(String[] args) {
        // IF-else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        // Read input as double (to handle decimals)
        double inputYear = sc.nextDouble();
        // Ignore Decimals
        int Year = (int)Math.floor(inputYear);
        // Check for negative
        if (Year < 0 || Year > 9999) {
            System.out.println("Invalid Input! Please enter a positive input");
        } else {
            // Leap year Logic
            if ((Year % 400 == 0) && (Year % 4 == 0)) {
            System.out.println(Year + "It is a Leap Year");
        } else if (Year % 100 == 0) {
            System.out.println(Year + "It is Not a leap year");
        } else {
            System.out.println(Year + "It is Not a leap year");
        }
    }
        sc.close();
}}
