package Ex_22_ENUM;

public class Lab198_Enum_P2 {
    public static void main(String[] args) {
        System.out.println(URLS.Katalon);
        if (URLS.Katalon.equals("Katalon")){
            System.out.println("I want to do something");
        }
    }
}
// Enum is not capital
enum URLS{
    Google, Restassured, Katalon, VWO
}