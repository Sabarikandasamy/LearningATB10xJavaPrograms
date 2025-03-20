package Ex_24_Exceptions;

public class Lab214_Good_tester {
    public static void main(String[] args) {
        try {
            String ip = args[0]; //java.lang.ArrayIndexOutofBoundsException
            int a = Integer.parseInt(ip); //NumberFormatException
            int b = 100 / a; //ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}