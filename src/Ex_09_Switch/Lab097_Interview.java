package Ex_09_Switch;

import javax.swing.*;

public class Lab097_Interview {
    public static void main(String[] args) {
        // incase of -> Multiple is not possible
         int a = 11; // just for dummy (confuse you)
         switch (-1) {
             default :
                 System.out.println("Default");
                 break;
             case -1 :
                 System.out.println("10");
                 break;
             case 9 :
                 System.out.println("9");
         }
    }
}
