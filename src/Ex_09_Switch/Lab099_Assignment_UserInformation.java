package Ex_09_Switch;

import java.util.Scanner;

public class Lab099_Assignment_UserInformation {
    public static void main(String[] args) {
        // Please do this assignment program for us
        // CLI Options
        //
         //Take a user input - Name, Age, and Salary and print them in the end.

        //Create a Scanner object for reading input
        Scanner scan = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        // prompt the user for their salary
        System.out.println("Enter your Salary");
        double salary = scan.nextDouble();

        // Print the collected information
        System.out.println("\n---User Information---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Close the Scanner
        scan.close();

        }
    }
