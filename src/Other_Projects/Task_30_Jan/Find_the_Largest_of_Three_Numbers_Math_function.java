package Other_Projects.Task_30_Jan;

import static java.lang.Math.*;

public class Find_the_Largest_of_Three_Numbers_Math_function {
    public static void main(String[] args) {
        int num1 = 564, num2 = 68, num3 = 687;
        // BY USING MATH.MAX FUNCTION
        int largest = Math.max(num1, Math.max(num2,num3));
        System.out.println("Largest number is:" + largest);
    }
}
