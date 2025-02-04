package Ex_06_Ternary_Operator;

public class Lab064_Ternary_Nested {
    public static void main(String[] args) {
        // result = condition ? expression1 : (condition2 ? expression2 : expression 3);

        int num = 12;
        String result = (num > 10) ? (num > 20 ? "G > 20" : "B 10 to 20") : "B";
        System.out.println(result);
    }
}
