import java.util.Scanner;

public class ArithmeticOperations {
    /**
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the Numbers");
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            s.close();

            System.out.println("Addition        :" + addition(num1, num2));
            System.out.println("Substraction    :" + substraction(num1, num2));
            System.out.println("Multiplication  :" + multiplication(num1, num2));
            System.out.println("Division        :" + division(num1, num2));
            System.out.println("Modulo          :" + modulo(num1, num2));
        }

    }

    static int addition(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    static int substraction(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }

    static int multiplication(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    static int division(int num1, int num2) {
        int quo = num1 / num2;
        return quo;
    }

    static int modulo(int num1, int num2) {
        int remider = num1 % num2;
        return remider;
    }

}
