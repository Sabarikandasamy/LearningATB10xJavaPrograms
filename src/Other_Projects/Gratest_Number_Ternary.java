package Other_Projects;

public class Gratest_Number_Ternary {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String Greatest_Number = num1>num2 ? "Num 1 is Greatest" : num1<num2 ? "Num 2 is Greatest" : "Both are equal";
        System.out.println(Greatest_Number);
    }
}
