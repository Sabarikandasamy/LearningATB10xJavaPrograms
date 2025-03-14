package Ex_21_Static;

public class Lab196_Static {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
        Automation.driver = "Brave";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2); //print null as default

    }
}

class Automation {
    static String driver = "Chrome";
    static String driver2;
}