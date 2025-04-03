package Other_Projects.Task_30_Jan;

public class Find_the_smallest_of_Three_Number_tERNARY {
    public static void main(String[] args) {
        int num1 = 56, num2 = 68, num3 = -897;
        int Smallest = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num1 < num3) ? num2 : num3);
        System.out.println("Smallest numnber is:" + Smallest);
    }
}
