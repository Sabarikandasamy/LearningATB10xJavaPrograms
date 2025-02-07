package Ex_12_Do_While;

public class Lab123_Example {
    public static void main(String[] args) {

       // this wont enter into the loop because the condition s false
        int a = 0;
        while (a < 0) {
            System.out.println(a);
            a++;
        }

        // this entre first and check the condition later
        do{
            System.out.println(a);
            a++;
        } while (a < 0);
    }
}
