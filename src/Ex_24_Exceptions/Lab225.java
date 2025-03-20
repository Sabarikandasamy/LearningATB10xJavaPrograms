package Ex_24_Exceptions;

public class Lab225 {
    public static void main(String[] args) {
        temp (23, 45);
        temp("Sabari", "Kanth");
        temp(true, false); 
    }
    static Integer <T> T temp (T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
