import java.util.Scanner;

public class Reverse {
    public static void main(String[] arg) {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer ");
        number = sc.nextInt();

        System.out.println("Enter the Size of an Array");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of an Array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        reverseMethod(number);
        reverseMethod(array);

    }

    static void reverseMethod(int n) {
        int m = n;
        int rev = 0, rem = 0;
        while (m > 0) {
            rem = m % 10;
            rev = rev * 10 + rem;
            m = m / 10;
        }

        System.out.println("Reversed Integer is : " + rev);
    }

    static void reverseMethod(int a[]) {
        int b[] = new int[a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            b[j] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
        System.out.println("Reversed Array is : ");
        for (int x : a) {
            System.out.print(x + " ");
        }

    }

}