package Ex_19_OOPs_Parameteric_Constructor.Inheritance.MultiLevelInheritance;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son Sabari = new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();

        Sabari.home();

        /* son s1 = new GrandFather();
           son s1 = new Father();
           son Sabari = new Son();*/

        GrandFather g1 = new Son();
        GrandFather g2 = new Father();
        Father f2 = new Son();
        //Father f3 = new GrandFather();

    }
}
