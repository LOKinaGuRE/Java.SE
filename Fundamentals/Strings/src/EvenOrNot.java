import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {

        int number ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
        number = sc.nextInt();
        if(number %2==0) {
            System.out.printf("%d is Even ",number);
        }
        else {
            System.out.printf("%d is Odd ",number);
        }
    }
}
