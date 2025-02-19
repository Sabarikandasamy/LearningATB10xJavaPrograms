package Ex_16_Arrays;

public class Lab150_Sum_Of_Arrays_N {
    public static void main(String[] args) {
        int[] number = {12,15,48,69,47,58,36,14,25,8936};
        int sum = 0;
        System.out.println("--- --- -- -");
        for (int n : number) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
