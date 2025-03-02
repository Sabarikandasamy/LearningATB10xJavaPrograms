package Ex_19_OOPs_Parameteric_Constructor.SuperKeyword;

import javax.xml.transform.Source;

public class Lab181 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();
    }
}

class Father {
    Father(){
        System.out.println("DC");
    }
    int gold = 10;
    void home(){
        System.out.println("home Father");
    }
}
class Son extends Father{
    Son() {
        super();
    }

    void t1(){
        super.home();
        System.out.println(super.gold);
    }
} // Super is to access Father Attributes, Methods, Behavior, Variable.