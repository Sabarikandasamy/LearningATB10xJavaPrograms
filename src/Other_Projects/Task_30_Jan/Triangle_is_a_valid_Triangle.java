package Other_Projects.Task_30_Jan;

import java.util.Scanner;

public class Triangle_is_a_valid_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First side angle: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second side:");
        double b = sc.nextDouble();
        System.out.println("Enter the third side:");
        double c = sc.nextDouble();

        if (isValidTriangle(a,b,c)) {
            System.out.println("The Triangle is Valid.");
        } else {
            System.out.println("The Triangle is not valid.");
        } sc.close();
    }
    public static boolean isValidTriangle (double a, double b, double c) {
        // Apply the triangle in equality theorem
        return (a+b>c) && (a+c >b) && (b+c >a);
    }
}
