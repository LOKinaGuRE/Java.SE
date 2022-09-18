import java.util.Scanner;

public class Maximun_Array_Element {
    public static void main(String[] args) {
        //Take first array elements input from user
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter the size of an array");
        int size = sc.nextInt();

        System.out.println("Enter the Elements :");
        int[] array = new int[size];

        //Using for loop for taking elements and storing  one by one from user
        for (int i=0 ; i<size ;i++){
            array[i]= sc.nextInt();
        }

        //Finding Maximum using loop
        int max = array[0]; //initial max value
        for (int i=0 ; i<size ; i++){
            if(max<array[i]) {
                max = array[i];
            }
        }

        System.out.println("Maximum Number of Array is : "+ max);

    }
}
