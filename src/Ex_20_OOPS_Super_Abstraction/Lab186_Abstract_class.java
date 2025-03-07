package Ex_20_OOPS_Super_Abstraction;

public class Lab186_Abstract_class {
    public static void main(String[] args) {
        WagonR wagonR = new WagonR();
        wagonR.drive();
    }
}
// Abstract - is Incomplete
// Car -> Engine, start, stop
// wagon R -> Car

class WagonR extends Engine{
    @Override
    void startEngine(){
        System.out.println("Start");
    }
    @Override
    void stopEngine() {
        System.out.println("Stop");
    }
void drive(){
        startEngine();
        System.out.println("I am driving");
        startEngine();
}
}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();

        }


