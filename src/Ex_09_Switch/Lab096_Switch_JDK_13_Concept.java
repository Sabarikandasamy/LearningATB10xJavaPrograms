package Ex_09_Switch;

public class Lab096_Switch_JDK_13_Concept {
    public static void main(String[] args) {

        int itemcode = 006;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 003,006,007:
                System.out.println("This is Mech");
                break;
        }

    }
}
