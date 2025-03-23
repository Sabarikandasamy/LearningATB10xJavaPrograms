package Ex_25_Generics;

public class    Lab225 {
    public static void main(String[] args) {
        temp (23, 45);
        temp("Sabari", "Kanth");
        temp("Kandasamy", 123);
        temp(true, false); 
    }
    //T -> can be any data type

    piblic static <T> T temp (T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
