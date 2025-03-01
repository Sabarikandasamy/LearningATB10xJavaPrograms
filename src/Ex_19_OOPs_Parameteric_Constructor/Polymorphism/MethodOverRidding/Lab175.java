package Ex_19_OOPs_Parameteric_Constructor.Polymorphism.MethodOverRidding;

public class Lab175 {
    public static void main(String[] args) {
        Sabari s = new Sabari();
        s.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Sabari(); //Dynamic Dispatch
        f1.home(); // method overriding  - ridden the father method
    }
}
