package Ex_08_If_Condition;

public class Lab081_If_P1_Commandline_args {
    public static void main(String[] args) {
         //Commandline args
        int age = Integer.parseInt(args[0]);

        if (age > 18) {
            System.out.println("You are allowed to Vote!!");
        }
    }
}
// if it is lessthan 18 nothing will be printed in the output, Because else statement is not given