import java.util.Scanner;

public class AreaUsingOverloadMethods {
    public static void main(String[] args) {

        float length, breadth, radius;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of rectangle");
            length = sc.nextFloat();

            System.out.println("Enter breadth of Rectangle");
            breadth = sc.nextFloat();

            System.out.println("Enter radius of Circle ");
            radius = sc.nextFloat();

        }

        System.out.println("Cicle Area = " + area(radius));
        System.out.println("Rectangle  Area = " + area(length, breadth));

    }

    static double area(float r) {
        return Math.PI * r * r;
    }

    static double area(float a, float b) {
        return a * b;
    }

}
