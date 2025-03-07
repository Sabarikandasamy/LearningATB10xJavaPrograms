package Ex_20_OOPS_Super_Abstraction;

import kotlin.jvm.internal.MagicApiIntrinsics;

public class Lab188_Interface_p2 {
    public static void main(String[] args) {
        P p = new P();
        p.incomplete1();
        p.incomplete2();
    }
}
class P implements I1{
    @Override
    public void incomplete1(){
        System.out.println("Incomplete 1 COMPLETE");
    }
    @Override
    public void incomplete2(){
        System.out.println("Incomplete2 COMPLETE");
    }
}

interface I1{
    void incomplete1();
    void incomplete2();
}
interface I2{
    void incomplete3();
}
