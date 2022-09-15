import java.lang.*;
import java.util.*;

public class Datatypes {
	public static void main(String arg[]) {
		System.out.println("Hey !");
		int n;//	   4 Byte 0 is default value
			// byte  1 byte 0 
			// short 2 byte 0
			// long  8 byte 0
		float fn;  //  4 byte 0
		double fd; //  8 byte 0
		char c;    //  2 byte \u0000
		boolean b ;//  ? Depend on JVM (1 bit --> 1 byte) 
			     //  either True or False  False(Default) 
		
		n = 23;
		fn= 1.006f;
		fd= 1.2323223228989898; 
		c = 'U';			// unicode ---> Character will not present in negative numbers
		b = true ;
		System.out.println("NOW OUTPUT");
		System.out.println( n + "  " + fn + "  " + fd + " " + c + " " + b );
		// If i didn't means I will be geeting adding of sums of numarical 
		// numbers and error for boolean Value

		System.out.println(n+fn+fd+c);

		// in above char  c will be added to the sum of other operands
		// char will uses it's charcaters ascii value
		// why is used "" in between the varibales?
		
		//char cc=-49;
		//System.out.println(cc);
// incompatible types: possible lossy conversion from int to char
	

		}
	}