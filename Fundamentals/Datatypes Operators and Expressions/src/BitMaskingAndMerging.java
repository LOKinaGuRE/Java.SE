package javabootcamp.MyJava.DataTypes;

public class BitMaskingAndMerging {
    public static void main(String[] args) {

        //Merging ---> OR operation
        int a=4;
        //want to merge with 2 ;
         a= a|7;
        System.out.println("A merged value with 7 : "+a);


        //Masking ---> AND operation
        //want to check whether bite in number present or not
        int b=0b1010;
            //want to check whether 4th value(3rd bit) present or not : 0  Not present
           // int d= 0b0100;
            //  int c=b & d ;

        //check whether 8th value (4th bit) present or not :8 (greater than zero : TRUE
        int c=0b1000;
        System.out.println("4th bit present : "+ (b&c));
       // System.out.println("C"+c);

        //Swapping ---> can be done with XOR operation

        int n=10, m=15;

        //swap without using a third variable
        n=n^m; // n: 1010 m:1111 n^m : 0101 :5
        m=n^m; // n: 0101 m:1111 n^m : 1010 :10
        n=n^m; // n: 0101 m:1010 n^m : 1111 :15

        System.out.println("N="+n +" "+"M="+m);

        System.out.println("____Exercice_____");
        System.out.println("");
        System.out.println("Merging two numbers in single Variable");

        byte b1=9,b2=12;
        int bm= b1|b2 ;
        System.out.println("Merged Value is : "+ bm);

        byte e1=9,e2=12;
        //stroing both value in single varible
        //byte 4 bits are one value other 4 bits for another value

        byte e;
        e = (byte)(9<<4);

       // System.out.println("e after e1<<4 : "+ String.format( "%8s",Integer.toBinaryString(e)));
        e = (byte)(e|12);
       // System.out.println("e after e|e2  : "+ String.format( "%8s",Integer.toBinaryString(e)));

        //merged e1 with e2 in e

        //-> now let's check whether 9 is present in c or not
        //using masking (and)
        System.out.println("-");
        System.out.println((e&0b11110000)>>4);
        System.out.println(e&0b00001111);






    }
}
