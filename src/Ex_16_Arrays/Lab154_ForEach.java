package Ex_16_Arrays;

public class Lab154_ForEach {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 90;
        a[1] = 63;
        a[2] = 68;

        //for (int i = 0; i < a.length; i++){
          //  System.out.println(a[i]);
        //}

        for (int i:a){
            System.out.println(i);
            System.out.println("*** ****");
        }

        String[] names = {"Pramod","amit", "lucky","anil"};

        for (String name : names) {
            System.out.println(name);
        }

    }
}
