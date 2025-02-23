package Ex_16_Arrays;

public class Lab153_1D_Arrays {
    public static void main(String[] args) {
        int a[] = new int[-1]; // no size //we can give -1 but it show error at runtime error

        int[] a2 = new int[5]; //[0,1,2,3,4]

         int[] a4 = new int[3];
         a4[0] = -90;
         a4[1] = -63;
         a4[2] = -68;

         // output: NegativeArraySizeException: -1

         }
    }