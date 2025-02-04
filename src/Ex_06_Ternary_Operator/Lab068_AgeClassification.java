package Ex_06_Ternary_Operator;

public class Lab068_AgeClassification {
    public static void main(String[] args) {
        // Adult, Minor, Senior
        // Senior > 65,
        // Minor < 18,
        // Adult > 18,
        int age = 25;
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
