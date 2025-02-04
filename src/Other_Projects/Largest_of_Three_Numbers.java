package Other_Projects;

public class Largest_of_Three_Numbers {
    public static void main(String[] args) {
    int a = 25;
    int b = 20;
    int c = 6;
    int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b :c);
        System.out.println(largest);
    }
}
