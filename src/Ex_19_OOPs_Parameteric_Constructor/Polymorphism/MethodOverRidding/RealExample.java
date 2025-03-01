package Ex_19_OOPs_Parameteric_Constructor.Polymorphism.MethodOverRidding;

public class RealExample {
    public static void main(String[] args) {
    TC t1 = new TC();
    t1.openBrowser();
    }
}
class CommonToAllTc{
    void openBrowser(){
        System.out.println("Open the Browser in 5 sec...");
    }
}
class TC extends CommonToAllTc{
    void StartTC(){
         openBrowser();
    }
}