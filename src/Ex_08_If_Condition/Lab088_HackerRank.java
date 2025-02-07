package Ex_08_If_Condition;

import java.util.Scanner;

public class Lab088_HackerRank {
    public static void main(String[] args) {
       // Eg Grade Calculator

       // Logic Building - java

       //Step 1 : Find the Input / Output
       //Input | score -> (0-100) (ask the interviewer) data type (int)
       //Output | grade -> data type -> char (ask the interviewer)

        //Step 2 : Basic Logic | Rough Logic
        // if (score >= 90 && score <=100 --> reture or print grade - A
        // else if (score >= 89 && score <= 80 --> return or print grade - B
        // else if (score >= 79 && score <= 70 --> return or print grade - C
        // else if (score >= 69 && score <= 60 --> return or print grade - D
        // else if (score >= 0 && score <= 59 --> return or print grade - F

        // else --> grade --> F

        // 3, write the code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score");
        int score = sc.nextInt();
        char grade = 'F'; // By Default of local variable is needed (good practice)

        if (score >=90 && score <=100){
            grade = 'A';
        } else if (score >= 80 && score <=89) {
            grade = 'B';
        } else if (score >= 70 && score <=79) {
            grade = 'C';
        } else if (score >= 60 && score <=69) {
            grade = 'D';
        } else{
            grade = 'F';
        }
        System.out.println("Your Grade is -> " + grade);
        sc.close();

       // Step 4: Edge case



    }
}
