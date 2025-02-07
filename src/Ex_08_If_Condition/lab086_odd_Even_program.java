package Ex_08_If_Condition;

import java.util.Scanner;

public class lab086_odd_Even_program {
    public static void main(String[] args) {
        // Create a program - Take user input
        // Check weather the input is even or odd number

        //Logic building formula
        /* Step 1: figure out inputs and outputs
          num (int) -> i/o -> Scanner Class can be used to take input
          string -> odd or even -> O/P, println */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a int number!");
        int num = sc.nextInt();

        //step 2 : Logic Rough
        //num%2 ==0 -> even - modulus - R == 0 -> even
        // num%2 !=0 -> odd ->

        //step 3 : Logic write
        if (num % 2 == 0) {
            System.out.println("Even");
        } else
        {
            System.out.println("Odd");
        }
        sc.close(); //edge cases (use chat gpt to find

        //step 4 : edge cases
        // large int, -Ve handle, zero, other input - G
    }
}
