package Ex_20_OOPS_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        Sabari s = new Kandasamy();
        Kandasamy k = new Kandasamy();
        s.display();
        System.out.println(s.a);
        // Webdrive driver = new ChromeDriver(); //dynamic Dispatch
    }

}
class Kandasamy implements Sabari{
    @Override
    public void display(){
        System.out.println(a);
    }
}
interface Sabari{
    int a = 10; //public variable
    void display();
}