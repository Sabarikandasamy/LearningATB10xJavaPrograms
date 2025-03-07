package Ex_20_OOPS_Super_Abstraction;

public class Lab184_Private {
    public static void main(String[] args) {

    }
    class XYZ{
        private int my_gold = 10;
    }
    class CAB extends XYZ{
        void display(){
            System.out.println(super.my_gold);
        }
    }
}
