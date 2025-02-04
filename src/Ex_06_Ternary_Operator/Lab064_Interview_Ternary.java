package Ex_06_Ternary_Operator;

public class Lab064_Interview_Ternary {
    public static void main(String[] args) {
         //Nested Ternary
         //result = condition1 ? expression1 : (condition2 ? expression 2 : expression3) : (condition3 ? expression 2: expression3);
         //used to reduce the lines of code
         int number = 5;
         String result = (number > 10) ? (number > 20? "G > 20" : "B 10 to 20") : (number < 20? "G < 20" : "B 10 to 20");
        System.out.println(result);
    }
}
