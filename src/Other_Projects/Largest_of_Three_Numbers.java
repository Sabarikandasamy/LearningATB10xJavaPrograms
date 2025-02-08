package Other_Projects;

public class Largest_of_Three_Numbers {
    public static void main(String[] args) {
        // 1.	Finding the Largest of Three Numbers a,b,c using the Ternary Operator
    int a = 25;
    int b = 20;
    int c = 6;

    int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b :c);
        System.out.println(largest);
    }
}
