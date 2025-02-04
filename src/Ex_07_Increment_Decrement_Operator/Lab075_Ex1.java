package Ex_07_Increment_Decrement_Operator;

public class Lab075_Ex1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // a++ -> A -> expA -> 10, a ->11
        // +
        // ++a -> B -> expB -> (1+11 = 12), a -> 12
        //expA + expB -> 10+12 -> 22
    }
}
