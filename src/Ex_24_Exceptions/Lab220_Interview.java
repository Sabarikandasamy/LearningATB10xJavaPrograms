package Ex_24_Exceptions;

import Ex_19_OOPs_Parameteric_Constructor.Inheritance.MultiLevelInheritance.Son;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab220_Interview {
    public static void main(String[] args) {
       try {
           FileInputStream fileInputStream = new FileInputStream("C://a.log");
    } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       } finally {
           System.out.println("Yes");
       }
       }
}
