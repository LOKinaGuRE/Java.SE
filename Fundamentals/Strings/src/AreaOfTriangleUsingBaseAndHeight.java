/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabootcamp;
import java.util.*;

/**
 *
 * @author LOKinaGuRE
 */
public class AreaOfTriangleUsingBaseAndHeight {
    public static void main(String []a){
        Scanner so = new Scanner(System.in);
        
        float base,height,area;

        System.out.println("Enter the Details:");

        System.out.print("Enter the Base value :");
        base = so.nextFloat();

        System.out.print("Enter the Height value :");
        height = so.nextFloat();
        
        area = (base * height ) / 2 ;
        System.out.println("Area of Triangle " +area );
        
    }
}
