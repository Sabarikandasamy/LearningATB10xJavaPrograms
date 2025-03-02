package Ex_19_OOPs_Parameteric_Constructor.SuperKeyword;

public class Lab180  {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1("Chrome");
        t1.openBrowser();
        System.out.println("Test Case T1");
        t1.CloseBrowser();
        System.out.println(t1.getBrowser());
    }
}
class BaseClass{
    private String browser;

    public BaseClass(String browser){
        this.browser = browser;
    }
    public String getBrowser(){
        return browser;
    }
    public void setBrowser(String browser, boolean isAdmin){
        if(isAdmin){
            this.browser = browser;
        } else {
            System.out.println("Change browser Not allowes, Not a Admin");
        }
    }
    void openBrowser() {
        System.out.println("Opening Browser!!");
    }
    void openBrowser(String browserName){
        System.out.println("Open Browser!! -> " + browserName);
    }
    void CloseBrowser() {
        System.out.println("Close Browser!!");
    }
}

class TestCase1 extends BaseClass{
    public TestCase1(String browser) {
        super(browser); //call to my parent constructor
    }
    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        System.out.println("Overit the parent Set Browser");
    }
}