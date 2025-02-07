package Ex_10_For_Loop;

public class Lab113_Odd_Even_50 {
    public static void main(String[] args) {

        // Shruti - to find the even numbers from 1 to 50
        for (int i = 0; i <= 50 ; i++) {  // we can use pre and post increment here (++i or i++)
            if (i % 2 == 0 ) {
                System.out.println("Even -> " + i);
            } else {
                System.out.println("Odd -> " + i);
            }

        }
    }
}
