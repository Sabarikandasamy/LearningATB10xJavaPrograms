package Other_Projects.Task_29_Jan;

import java.util.Scanner;

public class Find_Max_with_Mathabs {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = input1.nextInt();
        System.out.println("Enter Number 2");
        int num2 = input2.nextInt();
        if (Math.abs(num1) > Math.abs(num2)) {
            System.out.println("Maximum is: " + num1);
        } else {
            System.out.println("Maximum is: " + num2);
        }
    }
    }

