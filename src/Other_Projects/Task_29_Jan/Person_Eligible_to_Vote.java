package Other_Projects.Task_29_Jan;

import java.util.Scanner;

public class Person_Eligible_to_Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to Vote");
        } else if (age < 0) {
            System.out.println("Invalid Age. please enter valid data");
        } else {
            System.out.println("You are not eligible to Vote");
        }
    }
}
