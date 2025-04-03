package Other_Projects.Task_30_Jan;

public class Find_the_Largest_of_Three_Numbers_Ternary_operator {
    public static void main(String[] args) {
        int num1 = 56, num2 = 68, num3 = -897;
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num1 > num3) ? num2 : num3);
        System.out.println("Largest numnber is:" + largest);
    }
}