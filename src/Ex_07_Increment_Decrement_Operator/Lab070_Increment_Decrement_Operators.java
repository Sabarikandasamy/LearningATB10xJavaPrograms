package Ex_07_Increment_Decrement_Operator;

public class Lab070_Increment_Decrement_Operators {
    public static void main(String[] args) {
        // Pre - increment - ++ operand.
        // value is incremented first and then stored in the result.
        int a = 10; //(++a -> a+1)
        int b = ++a; //a -> 11, b -> 11
        System.out.println(b);
        System.out.println(a);

        /* Exp and result Table
         Line no | a | Result c
            8    | 10 | NA
            9    | 11 | 11
            10   | NA | 11
            11   | 11 | NA */
    }
}
