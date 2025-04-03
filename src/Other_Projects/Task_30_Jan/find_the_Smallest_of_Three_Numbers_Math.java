package Other_Projects.Task_30_Jan;

public class find_the_Smallest_of_Three_Numbers_Math {
    public static void main(String[] args) {

        // By using Math.min
        int num1 = 654, num2 = 36546, num3 = 54;
        int Smallest = Math.min(num1,Math.min(num2, num3));
        System.out.println("Smallest number is: " + Smallest);
    }
}
