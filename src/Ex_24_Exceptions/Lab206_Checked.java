package Ex_24_Exceptions;

import java.io.FileInputStream;
import java.util.logging.FileHandler;

public class Lab206_Checked {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("2");

        // Checked - JVM
        // JVM Knows about it, During compilation - JVM is saying that
        // there can be case when this file is not found.

        //JVM knows that this may lead to file not found exception
        // so it tells to handle it.

        //  FileInputStream fileInputStream = new FileInputStream("C://log.txt");

    }
}
