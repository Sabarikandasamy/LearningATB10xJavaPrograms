package Ex_24_Exceptions;

public class Lab224_Generics {
    public static void main(String[] args) {
        //something which can be reusable for multiple way
        temp_sum(23, 45);
        temp_sum("Pramod", "Dutta");
    }
    static Integer temp_sum(Integer a, Integer b) {
        return a+b;
    }
    static String temp_sum(String a,String b){
        return a+b;
    }
}
