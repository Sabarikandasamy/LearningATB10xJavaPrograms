package Ex_15_Strings_Functions;

public class Lab142_String {
    public static void main(String[] args) {
       //Creates a new string "Hallo World"
        String s1 = "hallo";
        String s2 =  "World!";
        String s3 = s1 +s2; //creates a new string "Hello World"

        System.out.println(s3);
        //System.out.println(s1.concat(s2));

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append("patel");
        System.out.println(stringBuilder);

        //StringBuffer, StringBuilder -2 more ways to create strings.

        // APPEND & CONCATINATION

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World!"); // Modify sb to "Hello World!"
        System.out.println(sb.toString()); //Output: Hello World!


        String s4 = s1 + s2; // Creates a new string "Hello World"
        System.out.println(s4); //Output: Hello World!
        System.out.println(s1);

    }
}
