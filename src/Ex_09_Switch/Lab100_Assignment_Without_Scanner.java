package Ex_09_Switch;

public class Lab100_Assignment_Without_Scanner {
    public static void main(String[] args) {
            // Please do this assignment program for us
            // CLI Options
            //
            //Take a user input - Name, Age, and Salary and print them in the end.

            // Prompt the user for their name
            String name = args[0];

            int age = Integer.parseInt(args[1]);

            double salary = Double.parseDouble(args[2]);


            // Print the collected information
            System.out.println("\n---User Information---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);

        }
    }

