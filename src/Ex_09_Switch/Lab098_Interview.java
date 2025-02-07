package Ex_09_Switch;

public class Lab098_Interview {
    public static void main(String[] args) {
        char code = 'C';
        switch (code) {
            default :
                System.out.println("Hello"); // there is no values so Default will be match
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
