package Ex_24_Exceptions;

public class Lab216_Ok_Ok_tester {
    public static void main(String[] args) {
        try {
            String ip = args[0]; //java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);
            int b = 100/a; //ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
