import java.util.Scanner;

public class IncreaseArraySize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the size of an array");
        int size = sc.nextInt();

        System.out.println("Enter the Elements :");
        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }

        for ( int i=0 ; i<size ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        //In  programming, we can't increase the size af existing array
        //We will create a new array of desired size and
        //Copy the elements of that array to new Array

        System.out.println("Enter The Desired Size ");
        int newSize = sc.nextInt();

        int[] bArray = new int[newSize];

        for (int i=0 ; i<size ; i++){
            bArray[i]=array[i];
        }

//        array = bArray;
//        bArray = null;


        System.out.println("New Array");
        for ( int i=0 ; i<newSize ; i++){
            System.out.print(bArray[i]+" ");
        }

    }
}