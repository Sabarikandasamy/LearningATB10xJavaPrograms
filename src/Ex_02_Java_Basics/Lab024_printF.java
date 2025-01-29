package Ex_02_Java_Basics;

public class Lab024_printF {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);
       // System.out.print(a);
      //  System.out.printF("Your variable name is %d", a); // while printing %d is replaced by 10

//        New line : Println
//        same line: Print
// for printF : %d or s or f or b will be automatically replaced by the stored variable value
//     %d -> int, byte, long, short -data_type
//     %s -> string
//     %f -> float
//     %b -> Boolean
        System.out.println();
        byte b = 10;
        System.out.printf("%d", b);
    }
}
