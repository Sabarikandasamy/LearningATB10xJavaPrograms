package Other_Projects.Task_30_Jan;

import java.util.Scanner;

public class Calculate_Grade_based_on_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!! please enter a valid marks from 0 to 100");
        } else {
            String grade;
            if (marks >= 90) {
                grade = "A+";
            } else if (marks >= 80) {
                grade = "A";
            } else if (marks >= 70) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 50) {
                grade = "D";
            } else if (marks >= 40) {
                grade = "E";
            } else if (marks < 0) {
                grade = "Invalid";
            } else {
                grade = "Fail";
            }
            System.out.println("Your grade is: " + grade);
        }
        sc.close();
    }
}