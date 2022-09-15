package javabootcamp.MyJava.Introduction;

import java.lang.*;
import java.util.Scanner;
// import java.util.*;
// Scanner class is preset in java util package 


public class ReadingFromKeyboard {
	public static void main(String []arg ){
	
	Scanner sObject  = new Scanner 	(System.in) ;
//    Classname object_of_Class = new Classname (Classname.methodname);
//
// Reading from Keyboard

	int b ;
	double sum,a ;

	
	//System.out.println("Enter the Two Numbers to calculate SUM " );
	//a=sObject.nextFloat();
	//b=sObject.nextInt();

	//sum=a+b;
	//System.out.println("SUM is : " + sum );

	//String s1;
	//s1=sObject.nextLine();
	//System.out.println(s1);

	sObject.useRadix(2);
	//useRadix method need arguments to be Passed
		a=sObject.nextDouble();
		b=sObject.nextInt();
	// Use radix can't be used for Float double types
	//String s=sObject.radix();
	//Radix we can't use for any other types except numerical
	System.out.println("Value of  a is : " +a );
	System.out.println("Value of  b is : " +b );

	
	}
}

	




	

