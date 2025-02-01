package Ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        //GST - 18.45
        int course = 100;
        float GST = 18.45F;
        int total_int = course+GST; // Narrow - Implicit casting (Not possible)
        int total_int = course+(int)GST; // Narrow - Explicit Casting

        float total = course + GST; // Widenning - Implicit happening automatically
        float total2 = (float)course+GST; // Widenning - Explicit
        System.out.println(total);
    }
}
