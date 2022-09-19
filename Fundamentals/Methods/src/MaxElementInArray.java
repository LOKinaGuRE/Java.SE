
import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String[] args) {

        System.out.println("Enter the Size of an Array");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();

            System.out.println("Enter the Arr Elements ");
            int[] a = new int[size];

            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }

            maximum(a);
            minimum(a);

            for (int x : a) {
                System.out.print(x + " ");
            }
        }

    }

    static int maximum(int a[]) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }

        System.out.println("max = " + max);
        return max;

    }

    static int minimum(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i])
                min = a[i];
        }
        System.out.println("min = " + min);
        return min;

    }
}
