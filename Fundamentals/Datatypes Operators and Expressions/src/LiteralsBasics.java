import java.lang.*;

public class LiteralsBasics {
	public static void main (String arg[]) {
		System.out.println();

		byte	v1= 125;	// int literal		int
		short	v2= 125;	// int literal		int
		int	v3= 125;	// int literal		int
		long	v4= 125L;	// long literal 		L 	or l
		float v5= 125F;	// float literal		F	or f
	     double v6= 125D;	// double literal		D	or by Default --> No need to mention 
		char	v7= 'U';	// char literal 		' '  
	    boolean v8= true ;	// bolean literal		either True or False

// a varible will by defaultly takes literal as decimal
// But we can store binary -- decimal -- octal -- Hexadecimal

		byte bv = 0b1010;			// to give binary use ob---- (binary value)
		byte ov = 012;			// to give octal use 0--- (octal value )
		byte dv = 10;			// Decimal will be there by default
		byte hv = 0xA;			// Hexadecimal --> 0x---- (Hexadecimal)
		System.out.println(bv);
		System.out.println(ov);
		System.out.println(dv);
		System.out.println(hv);
		System.out.println();

// integer <--- can store byte short int 
// long value can handle int(upto MAX_VALUE) and long
// float value handle only float (F)
// double value can handle float(upto MAX_VALUE) and Double

		//long lv = 99999999999999; Integer number large to handle
		  long lv = 99999999999999L;
		  System.out.println(lv);

		// int  iv = 1L; mismatch --> data loss in type conversion
		   int  iv = 1;
		System.out.println(iv);
		
		//float fvv = 77974.45464;
		//error: incompatible types: possible lossy conversion from double to float
		float fvv = 77974.4545454F;

		double dvv = 787979.5646F;
		System.out.println(fvv); // round off the given value after deciml 2 number only
		System.out.println(dvv); 

		// fOR reading large and like currancy numbers
		// in real life we use ,(commas) so. In java coding we can use _ (underscore) like comma for readalibility
		// purpose >>Complier will not compile that _ written in between the literals
		
		long mobileNumber = 6362_65_2643L ;
		System.out.println("LOKi Contact Number : " + mobileNumber)	;


		}
	}