import java.util.Scanner;

public class Searching_Element_In_Array {
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

        System.out.println("Enter a Number you wish to search");
        int key = sc.nextInt();
        String notification = "";

        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                System.out.println("Yes! Search successful");
                notification = key + " Value is present at Index" + i;
                break;
            } else {
                notification = "No! Search unsuccessfully : " + key + " not found";
            }

        }
        System.out.println(notification);
        sc.close();

    }
}
