import java.util.Scanner;

public class SumOfN_Numbers {
    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();

        int sum=0;


        for (int i=1 ; i<=number ; i++){
            sum = sum + i ;
        }
        System.out.printf("SUM OF FIRST %d NUMBERS IS : %d \n",number,sum);
    }
}
