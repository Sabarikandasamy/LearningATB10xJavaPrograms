package Ex_24_Exceptions;

import Ex_19_OOPs_Parameteric_Constructor.Inheritance.MultiLevelInheritance.Son;

public class Lab204_Exceptions {
    public static void main(String[] args) {

        System.out.println("Start the program");
        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
        int a = Integer.parseInt(ip); // java.lang.NumberFormatException: For input string: "Sabari"
        int b = 100/a;  // java.lang.ArithmeticException: / by zero when args -> 0

        System.out.println(b);
        System.out.println("End the program");

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "Sabari"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
    }
}
