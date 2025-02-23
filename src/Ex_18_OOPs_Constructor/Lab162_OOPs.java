package Ex_18_OOPs_Constructor;

public class Lab162_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        b1.name = "Nithin";

    }
}

class Baby {
    String name;

    //Default Constructor
    Baby(){
        System.out.println("I am called, Object is created!");
    }
    {
        //Instance initialization block
        System.out.println("I am also called, When class is loaded");
    }
}