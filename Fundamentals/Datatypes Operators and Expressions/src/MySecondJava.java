package javabootcamp.MyJava.Introduction;

import java.lang.*;
// import statement is mandatory
// even though if we didn't mentioned  , That will automatically called 

public class MySecondJava {

	public static void main (String []arg) {
// public static void main ()
// error: can't find main(String[]) method in class: MySecondJava
// writing main method without Parameters , Code will compile but will not execute
// :- So we need to mention Parameters 


		System.out.println("Hey You ! ");
		//System.out.println(arg[0]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        	//at MySecondJava.main(MySecondJava.java:15)

		System.out.println (arg[0]);
		System.out.println (arg[1]);

	}
}