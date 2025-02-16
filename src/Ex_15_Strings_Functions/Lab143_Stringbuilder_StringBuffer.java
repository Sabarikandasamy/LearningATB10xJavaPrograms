package Ex_15_Strings_Functions;

public class Lab143_Stringbuilder_StringBuffer {
    public static void main(String[] args) {

        // String -> 90%
        // Stringbuilder -> 5-7%
        // ThreadLocal -> Multi Threading ->

        StringBuffer stringBuffer = new StringBuffer("Sabari");
        stringBuffer.append("Kanth");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
