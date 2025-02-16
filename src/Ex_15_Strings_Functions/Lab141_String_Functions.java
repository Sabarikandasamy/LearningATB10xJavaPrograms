package Ex_15_Strings_Functions;

public class Lab141_String_Functions {
    public static void main(String[] args) {
        String name = "Sabari";
        System.out.println(name.length());
        //1. CharAt()
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(3)); //if 10//StringIndexOutOfBoundException (length is 5 and you are giving 10)

        //2. Concat -Concatination : Adding two
        System.out.println(name.concat("Kanth"));

        //3. Contains
        System.out.println(name.contains("Sabarii")); // False (Because it contains extra i)

        //4.  equals()
        System.out.println(name.equals("Sabari")); //True

        //5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("Sabari")); //True

        //6. indexof() //Sonal -> ¿ o
        System.out.println(name.indexOf('b'));

        String s1 = "madam"; //index : 0, 1, 2 ,3, 4
        // Returns the index within this string of the first occurance specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. Length()
        System.out.println(name.length());

        // 8. replace(,)
        System.out.println(name.replace('a', 'A'));

        // 9. Split()
        String name4 = "Sabari@live.Gmail";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);

        // 10.  substring(,);
        System.out.println(name.substring(1,3)); //ab
        String ss = "Hamburger";
        System.out.println(ss.substring(4,7)); //urg

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        //12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        //13. startsWith()
        System.out.println(name.startsWith("s")); //false because it is case sensitive

        //14. endsWith()
        System.out.println(name.endsWith("i")); //True because Sabari ends with "i"

        //15. trim()
        String name3 = "  sonal harish   ";
        System.out.println(name3.trim()); //the excess spaces are removed

        //16. compareTo()
        System.out.println(name3.compareTo("sonal")); //it works with comparing with unicode
        // always with intiger

        // 17. compareToIgnorecase()
        System.out.println(name.compareToIgnoreCase("sonal"));

        //STRING BUILDER (Append)
        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append("Patel");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("HI");
        //sb.append("It is my world");
        System.out.println(sb.toString());


    }
}
