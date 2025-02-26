package Ex_19_OOPs_Parameteric_Constructor_2;

public class Lab166_Param_Con_2 {
    public static void main(String[] args) {

        mobile iphone = new mobile ("Iphone","2020");
       mobile oneplus = new mobile ("One plus","2024");
        System.out.println(iphone.model_name);
        System.out.println(oneplus.model_name);
    }

    static class mobile {
       String model_name;
       String year_of_launch;

       mobile(String model_name_c,String year_of_launch_c) {
           this.model_name = model_name_c;
           this.year_of_launch = year_of_launch_c;
       }}}



