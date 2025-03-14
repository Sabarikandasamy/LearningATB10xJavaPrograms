package Ex_22_ENUM;
public class Lab199_Enum_P3 {
    public static void main(String[] args) {
        System.out.println(Colors.Red.getHexCode());
        System.out.println(Colors.Blue.getHexCode());
        System.out.println(Colors.Green.getHexCode());

        System.out.println(Locators.page_button.getLocators());
        System.out.println(APIURLS.google.getUrl());
    }

    // enum basically to how you store your variable
    enum Colors {
        Red("#FF0000"),
        Green("#61FF33"),
        Blue("#3377FF"),
        Yellow("#4477FF");

        private String hexCode;

        Colors(String hexCode) {
            this.hexCode = hexCode;
        }

        String getHexCode() {
            return this.hexCode;
        }
    }

    enum Locators {
        page_button("#btn"),
        page_input("#input1");

        private String locators;

        Locators(String locators) {
            this.locators = locators;
        }

        String getLocators() {
            return this.locators;
        }
    }
}