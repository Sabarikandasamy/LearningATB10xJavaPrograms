package Ex_18_OOPs_Constructor;

public class Lab164_Car    {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name = "Tesla Model 3";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        System.out.println(" ---- ");

        Car nano = new Car();
        nano.name = "Tata Jaguar";
        System.out.println(nano.name);
    }
   // if no value is given in constructor "car" : models, name , year.
    // the default value given in the car constructor is print else the above given value.
}
