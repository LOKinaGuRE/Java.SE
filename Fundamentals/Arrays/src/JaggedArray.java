import java.util.Random;
//import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

      //  Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][];

        A[0] = new int[2];
        A[1] = new int[4];
        A[2] = new int[1];

        for ( int i=0 ; i<A.length ; i++){
            for (int j=0 ; j < A[i].length ; j++){
                A[i][j] = new Random().nextInt(10) + 1;
                //Random numbers generation, using java package
            }
        }

        for (int[] ints : A) {

            for (int anInt : ints) {
                System.out.print(anInt + " |");
            }
            System.out.println();

        }
    }
}
