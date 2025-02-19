package Ex_16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Lab147 {
    public static void main(String[] args) { //String Array
        int[] marks = {56,58,87,95,14,65};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("-------");
        for (int i = 0; i<marks.length; i++) { // 0,1,2,3,4
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);

    }}
