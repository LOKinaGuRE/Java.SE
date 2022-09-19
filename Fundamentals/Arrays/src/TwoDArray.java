import java.util.Random;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows");
        int row = sc.nextInt();
        System.out.println("Enter the Number of Columns");
        int column = sc.nextInt();
        sc.close();

        int[][] TwoDArray = new int[row][column];

        // System.out.println("Enter the Array Elements ");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                TwoDArray[i][j] = new Random().nextInt(10) + 1;

            }
        }
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < TwoDArray[i].length; j++) {
                System.out.print(TwoDArray[i][j] + " |");
            }
            System.out.println();

        }

        System.out.println("Size of Array of 2nd Row");
        int m = TwoDArray[1].length;
        System.out.println(m);

        System.out.println("For -each ");
        for (int[] x : TwoDArray) {
            for (int y : x) {
                System.out.print(y + " |");
            }
            System.out.println();
        }

    }
}