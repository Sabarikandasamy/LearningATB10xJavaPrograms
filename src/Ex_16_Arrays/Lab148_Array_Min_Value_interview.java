package Ex_16_Arrays;

public class Lab148_Array_Min_Value_interview {
    public static void main(String[] args) {
        int[] array = {81, 86, 13, 75, 36, 94, 24, 66, 84, 66};
        //Min
        // Very important
        int min_output = give_min(array);
        System.out.println(min_output);
    }

    static int give_min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
