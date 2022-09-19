import java.util.Random;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows ");
        int row = sc.nextInt();
        System.out.println("Enter the Number of Columns");
        int column = sc.nextInt();
        sc.close();

        int[][] a = new int[row][column];
        int[][] b = new int[row][column];

        // For Addition A and M matrices should have same Row x Column
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new Random().nextInt(10) + 1;
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = new Random().nextInt(10) + 1;
            }
        }

        int[][] c = new int[row][column];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                c[i][j] = b[i][j] + a[i][j];
            }
        }

        System.out.println("Resultant Array : ");

        for (int[] ints : c) {
            for (int anInt : ints) {
                System.out.format("%02d  |", anInt);
            }
            System.out.println();
        }

    }

}
