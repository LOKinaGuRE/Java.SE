import java.util.Scanner;

public class PlayingWithPassing {
    public static void main(String[] args) {

        System.out.println("Enter the  Number");
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            System.out.print("New Updated Values, After passing to method : \n");
            System.out.println(n);
            System.out.println("Primitive Passed Doesn't Change it's Original value");
            System.out.print(" But It can return updtaed it's Passed (Copy of original element  :");
            System.out.println(updateBy5(n));

            System.out.println("Give an Size of Array ");
            int size = s.nextInt();
            System.out.println("Enter the Elements");
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = s.nextInt();
            }

            System.out.println();

            System.out.println("To change Everu value by +5 , Passing to updateArray Method ");
            updateArray(a);

            System.out.println("New Updtaed Array");
            for (int x : a) {
                System.out.print(x + "  |");
            }

            System.out.println("Changing Variable(Primitive Data Types, wih passing");
            System.out.println("There is no Change in it's Original Value");
            System.out.println();
            System.out.println("But pasing a array by value , it is modifing Original Array elements");
            System.out.println("With reference we can change , an Objects origial Values \n \n");

            System.out.println("Let's update the prsent array");
            System.out.println("On which index you want to Change");
            int index = s.nextInt();
            System.out.println("Enter the Value you want to Add");
            int value = s.nextInt();

            updateFromIndex(a, index, value);
            for (int y : a) {
                System.out.print(y + "  |");
            }
        }

    }

    static void increaseValue(int n) {
        n = n + 5;
    }

    static int updateBy5(int n) {
        n = n + 5;
        return n;
    }

    static void updateArray(int b[]) {
        for (int i = 0; i < b.length; i++) {
            b[i] = b[i] + 5;
        }

    }

    static void updateFromIndex(int b[], int n, int value) {
        b[n] = value;

    }
}
