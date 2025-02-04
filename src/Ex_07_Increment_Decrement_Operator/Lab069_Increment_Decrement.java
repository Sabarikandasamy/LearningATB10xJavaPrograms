package Ex_07_Increment_Decrement_Operator;

public class Lab069_Increment_Decrement {
    public static void main(String[] args) {
        // Take Inputs (Command line methof)
        String age_string = args[0]; //99
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(args[1]); //100
        System.out.println(args[2]); //101
        System.out.println(args[3]); //56
        // System.out.println(args[4]); // java.lang.ArrayIndexOutOfBoundsException
        // 99 100 101 56

        String canIGoGoa =  age >= 24 ? "Yes" : "No";
        System.out.println(canIGoGoa);
    }
    }
