package Other_Projects;

public class Table_of_9_using_printf {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // System.out.printf("9 x 1 = %d\n",number*1);
        System.out.printf("%dx1=%d\n", n, n * 1);
        System.out.printf("%dx2=%d", n, n * 2).println();
        System.out.printf("%dx3=%d", n, n * 3).println();
        System.out.printf("%dx4=%d", n, n * 4);
        System.out.println();
        System.out.printf("%dx5=%d\n", n, n * 5);
        System.out.printf("%dx6=%d\n", n, n * 6);
        System.out.printf("%dx7=%d\n", n, n * 7);
        System.out.printf("%dx8=%d\n", n, n * 8);
        System.out.printf("%dx9=%d\n", n, n * 9);
        System.out.printf("%dx10=%d\n", n, n * 10).println();
    }
}