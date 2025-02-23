package Ex_16_Arrays;

import java.util.Scanner;

public class Lab152_User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size in Integer only");
        int size = sc.nextInt();


        int[] numbers = new int [size];
        //String[] names = new String[size];
        //float[] numbers = new float[size];

          // for (int i = 0; i < size; i++) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number");
            numbers[i] = sc.nextInt(); // for float and string here we need to change
        }
        System.out.println("***End***");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
