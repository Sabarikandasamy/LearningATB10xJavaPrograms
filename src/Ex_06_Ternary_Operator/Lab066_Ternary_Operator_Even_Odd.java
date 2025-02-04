package Ex_06_Ternary_Operator;

public class Lab066_Ternary_Operator_Even_Odd {
    public static void main(String[] args) {

        int num = 57;
        String result = (num%2 ==0) ? "Even" : "Odd"; // = is for assigning the value (eg a = 10)
        System.out.println(result);                   // == is for comparing the value (eg a == 10)

    }
}
