package Ex_24_Exceptions;

public class Lab205 {
    public static void main(String[] args) {

        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);

        //Unchecked -> ArithmeticException, NullPointException

        //  java.lang.ArithmeticException: / by zero - unchecked - JVM doesn't know
    String name = null;
    name.trim(); // Trim removes the Trailing spaces.
        //java.lang.NullPointException: Cannot invoke "String.trim")
    }
}
