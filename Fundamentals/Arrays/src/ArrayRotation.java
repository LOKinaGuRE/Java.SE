import java.util.Scanner;

public class ArrayRotation {
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

        System.out.println("Select Choice : \n 1-> Right Rotation  ____  2-> Left Rotation");
        int option = sc.nextInt();
        int right, left;
        switch (option) {
            case 1 -> {
                System.out.println("Right Rotation");
                right = array[size - 1];
                for (int i = size - 1; i > 0; i--) {

                    array[i] = array[i - 1];
                }
                array[0] = right;
            }
            case 2 -> {
                System.out.println("LEFT Rotation");
                left = array[0];
                for (int i = 0; i < size - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[size - 1] = left;
            }
        }

        System.out.println("Resultant Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
