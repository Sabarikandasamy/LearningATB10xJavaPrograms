package Other_Projects;

public class Ternary_Grade_Calculator_Interview_Challenge {
    public static void main(String[] args) {
        // Nested ternary
        // result = condition1 ? expression1 : expression2;expression - (condition2 ? expression2 : expression3)

        //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        int marks = 9;
        String grade = (marks >= 90 && marks <=100)? "Grade A" : (marks >= 80 && marks <=89)? "Grade B" : (marks >= 70 && marks <=79)? "Grade C" : (marks >= 60 && marks <=69)? "Grade D" : (marks >= 0 && marks <=59)? "Grade F" : "Not Valid";

        System.out.printf("Your grade is %s",grade);


    }
}
