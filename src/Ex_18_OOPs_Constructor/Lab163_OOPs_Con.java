package Ex_18_OOPs_Constructor;

public class Lab163_OOPs_Con {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1);
        System.out.println(a2); // Output will print random references
               // Output: Ex_18_OOPs_Constructor.A@5b6f7412
    }
}
class A{
    A() {
        System.out.println("I want to read a CSV File");
        System.out.println("Open the page before loadingh the script");
        System.out.println("You can do anything which you want to do, When object is created");
        // FileInputStream fileInputStream = new FileInputStream("c://a.txt");
    }
}
