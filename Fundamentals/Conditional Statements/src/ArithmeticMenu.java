import  java.util.Scanner;

public class ArithmeticMenu {
    public static void main(String[] args) {

        int choice;

        int m,n;

        Scanner sc = new Scanner(System.in);



        System.out.println("Arithmetic___Operation___Menu");
        System.out.println("Press 1 : Addition");
        System.out.println("Press 2 : Subtraction");
        System.out.println("Press 3 : Multiplication");
        System.out.println("Press 4 : Division");
        System.out.println("Press 5 : Modulo");

        choice = sc.nextInt();

        switch (choice){
            case 1:  System.out.println("Please enter numbers :");
                m = sc.nextInt();
                n = sc.nextInt();
                System.out.printf("%d + %d = %d",m,n,m+n);
                break;
            case 2:  System.out.println("Please enter numbers :");
                m = sc.nextInt();
                n = sc.nextInt();
                System.out.printf("%d - %d = %d",m,n,m-n);
                break;
            case 3:  System.out.println("Please enter numbers :");
                m = sc.nextInt();
                n = sc.nextInt();
                System.out.printf("%d * %d = %d",m,n,m*n);
                break;
            case 4:  System.out.println("Please enter numbers :");
                m = sc.nextInt();
                n = sc.nextInt();
                System.out.printf("%d + %d = %d",m,n,m/n);
                break;
            case 5:  System.out.println("Please enter numbers :");
                m = sc.nextInt();
                n = sc.nextInt();
                System.out.printf("%d + %d = %d",m,n,m%n);
                break;


        }

    }
}
