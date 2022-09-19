import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        System.out.println("Enter the Two Numbers ");
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        s.close();

        System.out.printf("GCD of %d and %d is %d ", n1, n2, gcdOfNumber(n1, n2));

    }

    static int gcdOfNumber(int n, int m) {
        int min = (n < m) ? n : m;

        for (int i = 2; i <= min; i++) {
            if ((n % i == 0) && (m % i == 0)) {
                return i;
            }

        }
        return min;
    }
}