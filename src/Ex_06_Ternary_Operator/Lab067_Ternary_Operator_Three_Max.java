package Ex_06_Ternary_Operator;

public class Lab067_Ternary_Operator_Three_Max {
    public static void main(String[] args) {
        // Find the largest NUmber, n1, n2, n3 => max (n1,n2,n3)

        // Logic building :
        // Step 1: Find the input / output
        // n1 , n2, n3 --> data type --> int
        // Output --> int (ask the interviewer)
        // 23,34,10 --> 34 (ask example)

         //Step 2: rough logic
        // n1 >= n2 --> Y1 : N1
        // Y1 --> n1 >= n3 : Y(n1) : N(n3)
        // N1 -> n2 > n3 : Y(n2) : N(n3)

        int  n1 = 2, n2 = 9, n3 = 11;
        int largest = (n1 >= n2) ? ((n1 >= n3)? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number : " + largest);
    }
}
