package Ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int sharan_salary = 12;
        boolean b = !(sharan_salary > 10 || sharan_salary < 5);
        System.out.println(b);
        //sharan_salary 12 > 10 --> true
        //sharan_salary 12 < 5 --> false
        // (true || fales) --> as per (OR gate ||) it is true
        // the reverse is the output because of (! NOT gate) and true become false in the output.



    }
}
