package Ex_05_TypeCasting;

public class Lab060_Typecasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
       // short s = phone_no; // Implicit¿
        short s = (short)phone_no; // Explicit¿
    }
}
