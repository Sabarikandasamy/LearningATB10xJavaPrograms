package Other_Projects.Task_30_Jan;

import java.util.Scanner;

public class Triangle_is_valid_while_True {
    public static void main(String[] args) {
        // Create scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Input the three sides of the triangle
        double a = 0, b = 0, c = 0;
        boolean validInput = false;

        // Keep asking for input until valid positive integers are entered
        while (!validInput) {
            System.out.print("Enter the first side of the triangle (positive integer): ");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                if (a <= 0) {
                    System.out.println("Error: Side length must be a positive integer.");
                    continue;
                }
            } else {
                System.out.println("Error: Please enter a valid positive integer.");
                sc.next(); // Clear invalid input
                continue;
            }

            System.out.print("Enter the second side of the triangle (positive integer): ");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                if (b <= 0) {
                    System.out.println("Error: Side length must be a positive integer.");
                    continue;
                }
            } else {
                System.out.println("Error: Please enter a valid positive integer.");
                sc.next(); // Clear invalid input
                continue;
            }

            System.out.print("Enter the third side of the triangle (positive integer): ");
            if (sc.hasNextInt()) {
                c = sc.nextInt();
                if (c <= 0) {
                    System.out.println("Error: Side length must be a positive integer.");
                    continue;
                }
            } else {
                System.out.println("Error: Please enter a valid positive integer.");
                sc.next(); // Clear invalid input
                continue;
            }

            validInput = true; // Break the loop when all sides are valid
        }

        // Check if the triangle is valid
        if (isValidTriangle(a, b, c)) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
        sc.close();
    }

    // Function to check if the triangle is valid
    public static boolean isValidTriangle(double a, double b, double c) {
        // Apply the triangle inequality theorem
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}


