package Ex_20_OOPS_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        Sabari s = new Sabari();
        s.display();
        System.out.println(s.a);
    }

}
class Sabari implements Sabari{
    @Override
    public void display(){
        System.out.println(a);
    }
}
interface Sabari{
    int a = 10;
    void display();
}