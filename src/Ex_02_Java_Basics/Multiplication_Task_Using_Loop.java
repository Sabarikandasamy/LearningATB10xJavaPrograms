package Ex_02_Java_Basics;

public class Multiplication_Task_Using_Loop {
    public static void main(String[] args) {

        int num = 9;
        System.out.println("Multiplication of 9");

        for (int i = 1 ; i <= 10 ; i++) {
            System.out.printf("%d x %d = %d%n", num , i , num * i);
        }
    }
}
