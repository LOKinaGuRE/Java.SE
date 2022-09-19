import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Size");
        int size = sc.nextInt();

        System.out.println("Enter Array Elements");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // System.out.println("What is the last non_Empty index :");
        // int lastIndex = sc.nextInt();
        System.out.println("Enter the Index , That You want to delete :");
        int delIndex = sc.nextInt();
        sc.close();

        for (int i = delIndex; i < size - 1; i++) {

            array[i] = array[i + 1];

        }

        System.out.println("Resultant Array");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(array[i] + " ");
        }

    }
}