package Ex_10_For_Loop;

public class Lab115_Continue {
    public static void main(String[] args) {
        for (int i = 0 ; i < 50 ; i++) {
            if (i == 5){ // It will skip the 5 and continue from beginning
                continue; //Skip below code, move to top
            }
            System.out.println(i);
        }
    }
}
