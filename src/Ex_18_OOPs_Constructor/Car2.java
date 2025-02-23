package Ex_18_OOPs_Constructor;

public class Car2 {
    String model;
    int year;

    //previous
    Car2(){
        System.out.println("Default Constructor");
    }

    // Parameterized constructor.
    Car2(String model_name, int year_created) {
        this.model = model_name;
        this.year = year_created;
    }
}
