package Ex_20_OOPS_Super_Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}

class vehicle{
    public int maxSpeed = 180;
    void notest(){

    }
    vehicle(){
        System.out.println("Default Const");
    }
    vehicle(int a){
        System.out.println("Param Con");
    }

    // Method Overloading - same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }
    void message(int a){
        System.out.println("PC - argument");
    }
    void display(){
        System.out.println("vehicle Parent");
    }
}
   // Single Inheritance
class Car extends vehicle{
    private int maxSpeed = 281;
    Car(){
        super(100);
    }
    void test(){}
       Car(int a){
           System.out.println("PC Car");
       }

       @Override
       void display(){
           System.out.println("overide - Car");
           System.out.println(super.maxSpeed); //180 - Parent Max
           System.out.println(this.maxSpeed);
           super.notest();
           this.test();
       }
   }