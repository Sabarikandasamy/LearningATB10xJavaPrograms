package Other_Projects.Task_30_Jan;

public class find_the_Smallest_of_Two_Numbers {
    public static void main(String[] args) {

        int num1 = 654, num2 = 36546;
        int smallest;
  // Find the smallest number with If else
        if (num1 < num2) {
            smallest = num1;
        } else {
            smallest = num2;
        }
        System.out.println("Smallest number is:" + smallest);
        }
    }
