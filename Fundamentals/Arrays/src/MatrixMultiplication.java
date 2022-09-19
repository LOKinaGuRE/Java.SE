import java.util.Random;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows M1 ");
        int row1 = sc.nextInt();
        System.out.println("Enter the Number of Columns M1");
        int column1 = sc.nextInt();

        int[][] A = new int[row1][column1];


        System.out.println("Enter the Number of Rows M2 ");
        int row2 = sc.nextInt();
        System.out.println("Enter the Number of Columns M2");
        int column2 = sc.nextInt();

        int[][] B = new int[row2][column2];

        for ( int i=0 ; i<row1; i++){
            for (int j=0 ; j < column1 ; j++){
                A[i][j] = new Random().nextInt(10) + 1;
            }
        }

        for ( int i=0 ; i<row2 ; i++){
            for (int j=0 ; j < column2 ; j++){
                B[i][j] = new Random().nextInt(10) + 1;
            }
        }

        int[][] C = new int[row1][column2];
        if(! (row1 == column2)){
            System.out.println("M1 x M2 : Not Possible  ");
            System.out.println(" Rows of M1 should be equals to Columns of M2");
        }
        else {

            for (int i=0 ; i<row1 ; i++){
                for (int j=0 ; j<column2 ; j++){
                    for (int k=0 ; k<row2 ;k++ ){
                        C[i][j] += A[i][k] * B[k][j] ;
                    }
                }
            }
            for (int[] x : C){
                for (int y: x){
                    System.out.format( y + "   |");
                }
                System.out.println();

        }


        }
        sc.close();
    }
}