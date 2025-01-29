package Ex_02_Java_Basics;

public class Multiplication_Task_printf_withoutloop {
    public static void main(String[] args) {
        int num = 9;
        String completed = ("completed");
        System.out.printf("Multiplication table for %d%n", num);
        System.out.printf("%d × 1 = %2d%n", num, num * 1);
        System.out.printf("%d × 2 = %2d%n", num, num * 2);
        System.out.printf("%d × 3 = %2d%n", num, num * 3);
        System.out.printf("%d × 4 = %2d%n", num, num * 4);
        System.out.printf("%d × 5 = %2d%n", num, num * 5);
        System.out.printf("%d × 6 = %2d%n", num, num * 6);
        System.out.printf("%d × 7 = %2d%n", num, num * 7);
        System.out.printf("%d × 8 = %2d%n", num, num * 8);
        System.out.printf("%d × 9 = %2d%n", num, num * 9);
        System.out.printf("%d × 10= %2d%n", num, num * 10);
        System.out.printf("%s", completed);

    }
}