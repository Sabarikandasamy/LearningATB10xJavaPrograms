package Ex_16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab151_InterviewQ {
    public static void main(String[] args) {
        //Second largest number in the array.

        int [] number = {12,34,56,14,86,9,10};
        Arrays.sort(number); //9,12,14..
        System.out.println(number[number.length -2]);
    }
}
