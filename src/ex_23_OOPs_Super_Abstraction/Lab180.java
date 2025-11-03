package ex_23_OOPs_Super_Abstraction;

public class Lab180 {
    public static void main(String[] args) {

    }
}
class BaseClass{
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    private String browser;

    void openBrowser(){
        System.out.println("Open Browser");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser" + browserName);
    }


}


class TestCase extends BaseClass{
    TestCase() {
        //super(); / DC
        //super("Chrome"); // PC
        super.openBrowser(); // Normal - T1
        super.openBrowser("Chrome"); // Type 3
       // super.closeBrowser();//  Normal
        System.out.println(super.getBrowser()); // Get
        super.setBrowser("firefox"); // Set
    }
}