package Ex_07_Increment_Decrement_Operator;

public class lab071_Increment_Decrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); // Output is 11
        System.out.println(a);  // Output is 11

        // Post increment = Print first and then increase

        int a_post = 10;
        System.out.println(a_post++); // output is 10 after 10 it wii add increment and reflect in the next output
        System.out.println(a_post);   // output is 11
    }
}

