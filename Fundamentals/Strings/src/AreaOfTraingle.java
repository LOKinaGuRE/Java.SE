package javabootcamp;

import java.util.Scanner;
import java.lang.Math;

public class AreaOfTraingle {
    public static void main(String[] args) {
        System.out.println("Enter the Sides Details");
        System.out.println("-------");
        Scanner so = new Scanner(System.in);

        float a,b,c;
        float s;
        double area;// because Math.sqrt() returns double value

        a=so.nextFloat();
        b=so.nextFloat();
        c=so.nextFloat();

        s=(a+b+c)/2;

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("AREA OF TRIANGLE :" + area);

    }
}
