import java.util.Scanner;

public class CopingArrayEemets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter the size of an array");
        int size = sc.nextInt();

        System.out.println("Enter the Elements :");
        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }


        System.out.println("enter How many elements You want to Copy from Above Array");
        int bSize = sc.nextInt();

        int[] bArray = new int[bSize];

        if(size>=bSize){

            for (int i=0 ; i<bSize ; i++){
                bArray[i] =  array[i];
            }
            System.out.println(": New Array :");
            for (int x: bArray){
                System.out.print(x + " ");
            }
        }

    }
}
