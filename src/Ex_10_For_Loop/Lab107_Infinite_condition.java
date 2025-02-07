package Ex_10_For_Loop;

public class Lab107_Infinite_condition {  //Valid code but INFINITE PRINT
    public static void main(String[] args) {
        for (int i = 0; ;) {
            System.out.println("Hello");

            for ( ; ; ) {      //Dont use (Try to avoid infinite condition
                System.out.println("Morning");
            }
        }
    }
}
