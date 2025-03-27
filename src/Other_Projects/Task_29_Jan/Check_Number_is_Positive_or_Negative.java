package Other_Projects.Task_29_Jan;

import java.util.Scanner;

public class Check_Number_is_Positive_or_Negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
       int number = input.nextInt();
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("The number is Zero");
        }
    }
}
