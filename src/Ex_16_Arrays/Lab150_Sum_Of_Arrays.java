package Ex_16_Arrays;

public class Lab150_Sum_Of_Arrays {
    public static void main(String[] args) {
        int [] numbers = {12, 34, 10};
        // sum of the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

            System.out.println(sum);
        }
      }
}
