package Ex_06_Ternary_Operator;

public class Lab063_Ternary_Operator {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int number = -5;
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}