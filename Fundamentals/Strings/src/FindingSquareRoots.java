package javabootcamp;
import java.lang.Math;
import java.util.Scanner;

public class FindingSquareRoots {
    public static void main(String[] args) {
        int a,b,c;
        double d;
        double root1 , root2 ;

        System.out.println("Enter the Values a , b, c : ");
        Scanner so = new Scanner(System.in);
        a=so.nextInt() ;
        b=so.nextInt();
        c=so.nextInt();

        d = b*b - 4*a*c ;


            root1 =( -b + Math.sqrt(d)) / 2*a ;
            root2 =( -b - Math.sqrt(d)) / 2*a;

        System.out.println("R1: " +root1);
        System.out.println(("R2: "+root2));
    }
}
