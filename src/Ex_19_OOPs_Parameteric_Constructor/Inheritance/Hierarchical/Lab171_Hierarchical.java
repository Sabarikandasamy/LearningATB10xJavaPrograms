package Ex_19_OOPs_Parameteric_Constructor.Inheritance.Hierarchical;

public class Lab171_Hierarchical {
    public static void main(String[] args) {
        Sabari s1 = new Sabari();
        s1.h2();
        s1.home(); // Sabari is extended from father , he can use his and fathers

        Luckey l1 = new Luckey();
        l1.l2();
        l1.home(); // Luckey is extended from father , he can use his and fathers

        Ruhani r1 = new Ruhani();
        r1.r1();
        r1.home(); // cant use her fathers because not extended.
    }
}
