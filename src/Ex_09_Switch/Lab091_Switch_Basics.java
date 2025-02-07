package Ex_09_Switch;

import java.util.Scanner;

public class Lab091_Switch_Basics {
    public static void main(String[] args) {
        // User - Enter int number from 1 to 7
        // Which day it is it
        // 1 -> Mon, 4 -> Thur, 7 ->Sun, -1 -> Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7) ");
        int Day = sc.nextInt();

        switch (Day) {
            case 1:
                System.out.println("Mon");
                break;  // Break is to break the loop otherwise it will print all the remaining
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day it is");
                break;
        }
    }
}
