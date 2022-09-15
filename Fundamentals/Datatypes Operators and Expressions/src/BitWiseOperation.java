package javabootcamp.MyJava.DataTypes;

public class BitWiseOperation {
    public static void main(String[] args) {

        int x=10 , y=6;

        System.out.print("X value in Binary  : ");
        System.out.println(Integer.toBinaryString(x));
        System.out.println();

        int z = x & y ;
        // TRUE if both input bits are true
        System.out.println("AND OPERATION");
        System.out.println(" X & Y : " + z);
        System.out.println(" X & Y in Binary: " + Integer.toBinaryString(z));
        System.out.println("UPTO 32 Bits : "+ String.format( "%32s",Integer.toBinaryString(z)));
        //empty spaces show that there is presence of ZERO
        System.out.println();

        z = x | y ;
        //TRUE if any one of input bit is true
        System.out.println("OR OPERTAION");
        System.out.println("Z in Decimal : " + z);
        System.out.println("Z in Strings : " + Integer.toBinaryString(z));
        System.out.println("UPTO 32 Bits : "+ String.format( "%32s",Integer.toBinaryString(z)));
        System.out.println();

        z= x ^ y ;
        System.out.println("XOR OPERTAION");
        System.out.println("XOR in decimal: " + z);
        System.out.println("XOR in Strings: " + Integer.toBinaryString(z));
        System.out.println("UPTO 32 Bits : "+ String.format( "%32s",Integer.toBinaryString(z)));
        System.out.println();


        z= x<<1 ;
        //LEFT SHIT : DOUBLES THE VALUE of input
        //Input: 5 then after 1 bit LEFT SHIFT operation OUTPUT will be 10
        // n* power(2,k) ----> n * 2^k
        System.out.println("LEFT SHIT ");
        System.out.println("X = 10 : RIGHT SHIT OF X  in Decimal: " + z);
        System.out.println("X = 10 : RIGHT SHIT OF X  in Binary : " + Integer.toBinaryString(z));
        System.out.println();

        z= x>>1 ;
        //RIGHT SHIT : HALF'S THE VALUE of input
        //Input: 10 then after 1 bit LEFT SHIFT operation OUTPUT will be 5
        // n/(2,k) ----> n / 2^k
        System.out.println("RIGHT SHIT ");
        System.out.println("X = 10 : RIGHT SHIT OF X  in Decimal: " + z);
        System.out.println("X = 10 : RIGHT SHIT OF X  in Binary : " + Integer.toBinaryString(z));
        System.out.println();

        int v= -10;
        z= x>>>1 ;
        // same output as the right shift  // This effective work will be on -ve (signed) numbers

        int z1= v>>>1;
        System.out.println("unsigned RIGHT SHIT of X : "+z); System.out.println();
        // no change as >>> on positive numbers
        z=v>>1;
        System.out.println("RIGHT SHIT of V : "+z); System.out.println();



        System.out.println("V in Binary :              " + Integer.toBinaryString(v));
        System.out.println("unsigned RIGHT SHIT of V : " + Integer.toBinaryString(z1));

        System.out.println("Last Bit is ZERO NOT FIRST, Below is the 32 BIT Representation ");
        System.out.println("unsigned RIGHT SHIT of V : " + String.format( "%32s",Integer.toBinaryString(z1)));

//        System.out.println();
//        System.out.println(Integer.toBinaryString(z));
//        System.out.println(String.format( "%32s",Integer.toBinaryString(z)));
//
//        System.out.println();
//        System.out.println(Integer.toBinaryString(z1));
//        System.out.println(String.format( "%32s",Integer.toBinaryString(z1)));
//        System.out.println(z1);
//
        System.out.println();
        // x= 10
        int X_negative = ~x;
        System.out.println("X :" + x);
        System.out.println("~X:" +X_negative);
        // the NOt output will be x+1 value in negative

        System.out.println("X :" +String.format( "%32s",Integer.toBinaryString(x)));

        // Binary value opoosite structure of previous
        System.out.println("~X:" +String.format( "%32s",Integer.toBinaryString(X_negative)));



    }
}
