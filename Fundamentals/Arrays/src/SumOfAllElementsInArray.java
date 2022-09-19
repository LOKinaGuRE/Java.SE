import java.util.Scanner;

public class SumOfAllElementsInArray {
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
        // initial sum
        int sum = 0;

        // Now visit every element and add to the sum
        for (int i : array) {
            sum = sum + i;
        }

        System.out.println("Sum : " + sum);

    }
}
