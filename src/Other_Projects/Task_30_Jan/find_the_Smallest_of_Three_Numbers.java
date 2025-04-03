package Other_Projects.Task_30_Jan;

public class find_the_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        int num1 = 5, num2 = -86, num3 = 897;
        int Smallest;
        // By using If else statement
        if (num1 < num2 && num1 < num3) {
            Smallest = num1;
        } else if (num2 < num3) {
            Smallest = num2;
        } else {
            Smallest = num3;
        }
        System.out.println("Largest number is:" + Smallest);
    }
}