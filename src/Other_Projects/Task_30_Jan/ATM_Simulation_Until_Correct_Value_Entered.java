package Other_Projects.Task_30_Jan;

import java.util.Scanner;

public class ATM_Simulation_Until_Correct_Value_Entered {
    public static void main(String[] args) {
        double Balance = 10000;
        Scanner sc = new Scanner(System.in);

        // Keep asking the user input until correct
        while (true){
        System.out.println("Enter the amount you want to withdraw: ");
        double withdrawalAmount = sc.nextDouble();

        if (withdrawalAmount <= 0) {
            System.out.println("Error:Withdrawal amount must be greater than zero.");
        } else if (withdrawalAmount % 100 !=0) {
            System.out.println("Error: Amount must be a multiple of ₹100.");
        } else if (withdrawalAmount > Balance) {
            System.out.println("Error: Insufficient balance.");
        } else {
            Balance -= withdrawalAmount;
            System.out.println("Withdrawal successful!! your updated balance is: ₹" + Balance);
            break; //Exit the loop since the withdrawal was successful
        }} sc.close();
    }
}

