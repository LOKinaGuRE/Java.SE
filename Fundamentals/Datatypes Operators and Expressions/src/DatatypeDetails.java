import java.lang.*;

public class DatatypeDetails {
	public static void main(String arg[]) {
		System.out.println();

		// int -- 32 bit 
		//short-- 16bit
		//long -- 64 bit
		
		//float --less accuracy 32 bit (upto 6-7 numbers after decimal) round off 
		//double --more accuracy 64 bit (upto 14-15 numbers after decimal )

		//CPU 1 Cycle --> one datatype 
		//65 / 32 bit :

	// 1 byte ---> 8 bits (bit is atomic component)
	// in one byte the value will be stored in binary digits of 8 bits
	// last bit is for the Sign Purpose ( 0 +ve    1 -ve)
	// for any -ve number : First take binary number of that number ---> 2's cpmplement :
	//that is the negative number

	// 2's complemnet : Take a number in binary ---> do 1's Complement---> add 1 to rightmost diigt:

		int x= -5;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toHexString(x));
		// to see given number into specific number system 

// How number system will store floating numbers
// 163.25
// 163.25 x 100/100
// 16325  x 1/100
// 16325 x 10-2 (exponant)
// 16325E-2 (IEEE 754)

// Char A,B,C ------Z  65,66,67---- 90
// Char a,b,c ------z  97,98,99---- 122
// 0,1,2 --------9     48,49,50---- 57
// ASCii values fit in 1 byte 
// For unicode support java's Char is have 2 Bytes

//For Boolean : it need 1 bit But the actual size depends on the JVM 

		char c = 67;
		char d = 67;
		
		System.out.println(c);
		System.out.println(c+""+d);
		System.out.println(c+d);


		



	}
}