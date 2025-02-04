package Ex_06_Ternary_Operator;

public class Lab062_Ternary_Operator {
    public static void main(String[] args) {
        // result = condition¿ expression1 : expression2
        int age = 18;
        String canIvote = age >= 18 ? "Yes, You can vote" : "No, You can#t vote";
        System.out.println(canIvote);
    }
}
 // output : Yes, You can vote
// String is a non premitive data type