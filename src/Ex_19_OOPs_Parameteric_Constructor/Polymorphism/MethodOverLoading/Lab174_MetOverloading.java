package Ex_19_OOPs_Parameteric_Constructor.Polymorphism.MethodOverLoading;

public class Lab174_MetOverloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations(); //Class name
        int r = m1.add(3, 4);
        System.out.println(r);

        int r1 = m1.add(3, 4, 5);
        System.out.println(r1);

        double r2 = m1.add(68.46,6546.654);
        System.out.println(r2);
    }
}