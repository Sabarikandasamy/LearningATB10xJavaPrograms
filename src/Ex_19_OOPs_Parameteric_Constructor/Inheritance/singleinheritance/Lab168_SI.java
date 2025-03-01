package Ex_19_OOPs_Parameteric_Constructor.Inheritance.singleinheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son Sabari = new Son();
        System.out.println(Sabari.gold_f);
        Sabari.bhk2(); //Fathers bhk2

        Son2 Kanth = new Son2();
        System.out.println(Kanth.gold_f);
        Kanth.bhk2();

    }
}
