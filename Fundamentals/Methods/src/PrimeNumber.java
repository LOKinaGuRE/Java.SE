import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number");
        number = sc.nextInt();
        sc.close();
        PrimeNumber pm = new PrimeNumber();

        // Without declaring method name as Static we can use a method
        // With the help of Instantiating a Class constructor

        System.out.println("Enterd is Prime : " + pm.isPrime(number));
    }

    boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }

        return prime;
    }

}