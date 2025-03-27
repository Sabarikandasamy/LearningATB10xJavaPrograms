package Other_Projects.Task_29_Jan;

import java.util.Scanner;

public class Check_OddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("It is Even number");
        } else {
            System.out.println("It is Odd number");
        }
    }
}