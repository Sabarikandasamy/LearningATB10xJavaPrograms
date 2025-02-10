package Ex_13_Functions;

import java.util.Scanner;

public class Lab129_Task {
    public static void main(String[] args) {

        // Create a Function of Sub, Add, Mul AND Div
        // with parameter, a, b (Take the parameter from the user)

        // Step 1: Input and output (a,b --> INT --> Scanner) int --> variable result
        // Step 2: Rough logic --> Create functions
        // Functions --> type 4th --> with arguments and with return
        // Step 3: Write the code and Find and Fix --> Edge cases
        // Step 4:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1 ");
        if (scanner.hasNextInt()){
            int a = scanner.nextInt();
        } else {
            System.out.println("Enter the int only");
        }
        // BigInteger a = scanner.nextBigInteger();
        int a = scanner.nextInt();
        System.out.println("Enter the num2 ");
        int b = scanner.nextInt();

        int result_sum = sum(a, b);
        int result_sub = sum(a, b);
        int result_mul = sum(a, b);
        int result_div = sum(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
    }
     static int sum(int a, int b){
        return a+b;
     }
     static int sub(int a, int b) {
        return a-b;
     }
     static int modulus(int a, int b) {
        return a % b;
     }

     static float div(int a, int b){
        if (b==0 ){
            System.out.println("Div by Zero is not allowed");
        }
        return a/b;
     }
}
