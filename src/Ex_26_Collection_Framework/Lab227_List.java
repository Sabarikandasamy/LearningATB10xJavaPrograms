package Ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List {
    public static void main(String[] args) {

//        List fruits = List.of("orange","apple","banana","mango","watermelon");
//        System.out.println(fruits);
        // Static method can be fully implemented in interface.
        // Default method - can full implemented in interface.
        //fruits.add("Chery"); // java.lang.UnsupportedOperationException
        //fruits.remove("apple"); // Not possible

        ArrayList arrayList = new ArrayList();
        arrayList.add("Sabari");
        arrayList.add(null);
        arrayList.add("Kanth");
        arrayList.add("Kanth"); // Duplicate is allowed.
        arrayList.add(123); // Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());


        List li = new ArrayList(); // Dynamic Dispatch
        li.add("123");
        li.add("456");
        System.out.println(li);

    }
}
