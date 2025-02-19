package Ex_16_Arrays;

import java.util.SortedMap;

public class Lab145 {
    public static void main(String[] args) {
        int [] marks = {1, 2, 3, 4,5 ,6}; //1. Predefined method

        //2. method
        int[] marks1 = new int[5]; //Fixed Size
        //  int[] marks2 = new int[5]; //Fixed Size
        System.out.println(marks1.length);
        String s1 = "Sabari";
        System.out.println(s1.length()); //String we use Functions

        //3. Not advisable
        marks1[0] = 91;
        marks1[1] = 58;
        marks1[2] = 67;
        marks1[3] = 90;
        marks1[4] = 51;
        System.out.println(marks1[0]);
        System.out.println(marks1[4]);
        System.out.println(marks1[10]);// ArrayIndexOfBoundsException






    }
}
