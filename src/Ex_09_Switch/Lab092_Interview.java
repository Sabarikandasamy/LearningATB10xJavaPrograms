package Ex_09_Switch;

import java.util.Scanner;

public class Lab092_Interview {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // Chrome -> execute chrome
        // Firefox -> execute firefox
        // edge -> edge browser cases.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scan.next();

        switch (browser) {
            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println("..........");
                System.out.println("TC");
            case "firefox" :
                System.out.println("Start the Firefox browser");
                // Further code to start the firefox
                // webdriver driver = new Firefox(); // Selenium code
                break;
            case "edge" :
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no Idea");
                break;
        }
    }
}
