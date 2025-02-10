package Ex_14_Strings;

public class Lab138_Interview_Q2 {
    public static void main(String[] args) {
        String s1 = "Hello"; // scp 1
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hallo");
        String s5 = new String("hallo"); // OA - 3

        // == ¿ Comparison -> Strings -> This check the locations ref.
        System.out.println(s1 == s3); //False
        System.out.println(s1 == s2); //False
        System.out.println(s2 == s5); //False
        System.out.println(s1 == s4); //True

      // equals (content) -> value check (Case sensitive)
        // How can I check the values¿ equals== values
        System.out.println(s1.equals(s4)); //True
        System.out.println(s2.equals(s5)); //False

        System.out.println(s3.equalsIgnoreCase(s5)); // true

        // equalsIgnoreCase -> sabari. Sabari. SABARI. SAbaRI. SABAri
    }
}
