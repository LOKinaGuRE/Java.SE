import java.util.Scanner;

public class ReverseCopyOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter the size of an array");
        int size = sc.nextInt();

        System.out.println("Enter the Elements :");
        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int[] bArray = new int[size];

        System.out.println("Reversed Array");

        for (int i=0,j=size-1  ; i<size ; i++ ,j-- ){
            bArray[i] = array[j];
        }

        System.out.println();
        for ( int x: bArray){
            System.out.print(x + " ");
        }

    }
}
