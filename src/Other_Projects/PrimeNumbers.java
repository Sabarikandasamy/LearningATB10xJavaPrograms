package Other_Projects;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 189745486;
        boolean prime = true;
        for (int i=2; i<num; i++) {
            if (num%i==0 ) {
                System.out.println(num + " Not a prime Number");
                prime = false;
                break;
            }
            }
            if (prime == true) {
                System.out.println(num + " Prime Number");
            }
            }
        }
