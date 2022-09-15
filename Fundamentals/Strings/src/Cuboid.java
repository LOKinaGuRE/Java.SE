package javabootcamp;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        Scanner so = new Scanner(System.in);
        float length , breadth , height ;
        double areaOfCuboid , volumeOfCuboid ;

        System.out.println("Enter cuboid Basic Details : ");

        System.out.print("LENGTH : ");
        length = so.nextFloat();

        System.out.print("BREADTH : ");
        breadth = so.nextFloat();

        System.out.print("HEIGHT : ");
        height = so.nextFloat();

        float frontFace = length * height ;
        float rightFace = height * breadth ;
        float topFace   = length * breadth ;

        volumeOfCuboid  = length * breadth * height ;
        areaOfCuboid    = 2 * ( frontFace + rightFace + topFace );

        System.out.println("AREA OF CUBOID IS   : " + areaOfCuboid);
        System.out.println("VOLUME OF CUBOID IS : " + volumeOfCuboid);


    }
}
