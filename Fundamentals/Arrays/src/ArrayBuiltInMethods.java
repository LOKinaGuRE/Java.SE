import java.util.Arrays;
import java.util.Scanner;

public class ArrayBuiltInMethods {
    public static void main(String[] args) {

        System.out.println("Enter the Size of String Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        System.out.println("After Sorting Array");
        Arrays.sort(arr);
        // java.util.Arrays.____ (function(arguments))

        for (String x : arr) {
            System.out.println(x);
        }
    }
}
