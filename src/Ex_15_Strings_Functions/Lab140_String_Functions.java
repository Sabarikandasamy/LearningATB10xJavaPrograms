package Ex_15_Strings_Functions;

public class Lab140_String_Functions {
    public static void main(String[] args) {

        String str1 = "hello"; // SCP, OA¿ --> // Creates or Reuse "Hello" in the String
        String str2 = "hello";
        String str3 = new String("Hello"); //Creates a new object on the heap

        System.out.println(str1 == str2); //True (Both are equal)
        System.out.println(str1 == str3); // False (because both are in different location and identified as different)
        System.out.println(str1.equals(str3)); //
    }
}
