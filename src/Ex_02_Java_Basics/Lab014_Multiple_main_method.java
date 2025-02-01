package Ex_02_Java_Basics;

public class Lab014_Multiple_main_method {
    public static void main(String[] args) {
        System.out.println("QA Engineer");
        main(new int[]{1,2,3});
    }
    public static void main(int[] args) {
        System.out.println("Software");

//        can run many main functions but not with the same
    }
}