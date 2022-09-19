import java.util.Scanner;

public class Insertion_In_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Size");
        int size = sc.nextInt();

        System.out.println("Enter Array Elements");
        int[] array = new int[size];

        for (int i = 0; i < size - 1; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the Index , That You want to insert :");
        int insIndex = sc.nextInt();

        System.out.println("enter the element to insert");
        int elm = sc.nextInt();
        sc.close();

        for (int i = size - 1; i > insIndex; i--) {
            array[i] = array[i - 1];
        }
        array[insIndex] = elm;

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

//
// int[] a = new int[10];
//
// a[0] = 1;
// a[1] = 2;
// a[2] = 3;
// a[3] = 4;
// a[4] = 5;
// a[5] = 6;
//
// int lastIndex=5;//This is the last index where index is present
//
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the index Where you want to Insert");
// int n = sc.nextInt();
// System.out.println("Enter the element you want to store ");
// int element = sc.nextInt();
//
// //after inserting last element index changes
// lastIndex++;
// for (int i=lastIndex; i>n; i--){
// a[i] = a[i-1] ;
//
// }
// a[n] = element;
//
//
//
// System.out.println("Result Array ");
// for (int i=0 ; i<= lastIndex ; i++){
// System.out.print(a[i]);
//
//
// }
// }
//
// }
