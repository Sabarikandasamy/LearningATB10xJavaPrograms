package Ex_24_Exceptions;

public class Lab217_Interview {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("Div by Zero");
        } finally {
            System.out.println("I will be executed anyhow!!");
        }
    }
}
