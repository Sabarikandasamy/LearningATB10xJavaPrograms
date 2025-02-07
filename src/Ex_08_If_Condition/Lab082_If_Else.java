package Ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else {
    public static void main(String[] args) {
        //Allowed to vote or not
        //If age > 18 -> allowed to vote.
        //else age <>18 -> Not allowed to vote.

         // Scanner class : For getting user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!"); //we can mention the user to enter Integer only

        int age = sc.nextInt(); //The user input value is assigned here and stored in age

        // if the input entered as character //java.util.InputMissmatchException
         if (age > 18) {
            System.out.println("You are allowed to vote");
        } else {
            System.out.println("Not Allowed!!");
        }
    }
}
