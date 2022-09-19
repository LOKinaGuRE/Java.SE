import java.util.Scanner;

public class SecondLargest_ArrayElement {
    public static void main(String[] args) {

        // Take first array elements input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the size of an array");
        int size = sc.nextInt();

        System.out.println("Enter the Elements :");
        int[] array = new int[size];

        // Using for loop for taking elements and storing one by one from user
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        // Finding Maximum using loop
        int max1 = array[0];
        int max2 = array[0]; // initial max value
        for (int i = 0; i < size; i++) {
            if (max1 < array[i]) {

                max2 = max1;
                max1 = array[i];
            } else if (max2 < array[i]) {
                max2 = array[i];
            }
        }

        System.out.println("Maximum Number of Array is : " + max1);
        System.out.println("SecondLarge  Number of Array is : " + max2);

    }
}
