package Ex_16_Arrays;

public class Lab148_Array_Max_Value_interview {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 77, 18, 29, 49};
        // Max, Min.

        //Logic building formula
        //1.  Input -> Array -> int
        //    Output -> int - 77
        int max_output = give_max(array);
        System.out.println(max_output);
    }
    static int
 give_max(int[] array) {
        // Logic
        int max = array[0]; //25
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
