package Other_Projects.Task_30_Jan;

import java.util.Scanner;

public class Check_if_a_Number_is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (isprime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + "is not a prime number.");
        }
        sc.close();
    }
    public static boolean isprime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        } return true;
    }
}
