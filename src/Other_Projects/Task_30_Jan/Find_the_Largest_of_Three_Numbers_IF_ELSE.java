package Other_Projects.Task_30_Jan;

public class Find_the_Largest_of_Three_Numbers_IF_ELSE {
    public static void main(String[] args) {
        int num1 = 5, num2 = -86, num3 = 897;
        int largest;
        // By using If else statement
        if (num1 > num2 && num1> num3) {
           largest = num1;
        } else if (num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("Largest number is:" + largest);
    }
}
